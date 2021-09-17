package cn.gson.hui_ren_boot.model.service.drug;

import cn.gson.hui_ren_boot.model.mapper.drug.DoseMapper;
import cn.gson.hui_ren_boot.model.mapper.drug.SendDrugMapper;
import cn.gson.hui_ren_boot.model.pojos.outpatient.PaymentDetai;
import cn.gson.hui_ren_boot.model.pojos.outpatient.PaymentForm;
import cn.gson.hui_ren_boot.model.pojos.outpatient.PrescriptionDetail;
import cn.gson.hui_ren_boot.model.pojos.outpatient.PrescriptionList;
import cn.gson.hui_ren_boot.model.pojos.pharmacy.Dose;
import cn.gson.hui_ren_boot.model.pojos.pharmacy.SendDrug;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class SendDrugService {

    @Autowired
    SendDrugMapper sendDrugMapper;

    @Autowired
    DoseMapper doseMapper;

    //根据处方单号查询处方单
    public List<PrescriptionList> findAllPrescriptionList(List<String> prescriptionNo){
        return sendDrugMapper.findAllPrescriptionList(prescriptionNo);
    }


    //根据处方单号查询处方详单
    public List<PrescriptionDetail> findAllPrescriptionDetail(String prescriptionNo){
        return sendDrugMapper.findAllPrescriptionDetail(prescriptionNo);
    }

    //根据处方单号查询处方详单
    public List<PrescriptionDetail> findPrescriptionDetail(List<String> prescriptionNo){
        return sendDrugMapper.findPrescriptionDetail(prescriptionNo);
    }

    //查询所有的缴费记录表
    public List<PaymentForm> findAllPaymentForm(String recordNo){
        return sendDrugMapper.findAllPaymentForm(recordNo);
    }

    //根据缴费记录单号查询缴费详单
    public List<PaymentDetai> findAllPaymentDetail(String paymentNo){
        return sendDrugMapper.findAllPaymentDetail(paymentNo);
    }

    //查询处方单有没有发药记录
    public List<SendDrug> findAllSendDrug(String prescriptionNo){
        return sendDrugMapper.findAllSendDrug(prescriptionNo);
    }


    //新增发药单
    public void addSendDrug(Map<String,Object> datas ){
        List<String> list = (List<String>)datas.get("prescriptionNo");//处方单号
        String str = JSON.toJSONString(datas.get("sendDrug"));//发药实体对象
        SendDrug sendDrug = JSON.parseObject(str, SendDrug.class);
        List<Double> lists = (List<Double>)datas.get("sendPrice");//处方单的总金额
        List<SendDrug> sendDrugs = new ArrayList<>();//发药单的集合
        List<Dose> dose = new ArrayList<>();//发药详情的集合

        //发药单实体类
        for (int i = 0; i <list.size() ; i++) {
            if(list.get(i).substring(0,2).equals("WM")){
                sendDrugs.add(new SendDrug(sendDrug.getSendNum(),2L,lists.get(i),sendDrug.getSendPeople(),list.get(i)));
            }else if(list.get(i).substring(0,2).equals("CM")){
                sendDrugs.add(new SendDrug(sendDrug.getSendNum(),1L,lists.get(i),sendDrug.getSendPeople(),list.get(i)));

            }
        }
        //根据处方单号查询处方详单
        List<PrescriptionDetail> allPrescriptionDetail  = sendDrugMapper.findPrescriptionDetail(list);//处方详单的集合

        //根据处方详单生成发药详单
        for (int i = 0; i < allPrescriptionDetail.size(); i++) {
            if(allPrescriptionDetail.get(i).getPrescriptionNo().substring(0,2).equals("WM")){
                dose.add(new Dose(allPrescriptionDetail.get(i).getDrug().getDrugId(), allPrescriptionDetail.get(i).getAggregate(), "门诊发药",sendDrug.getSendNum()));
            }else if(allPrescriptionDetail.get(i).getPrescriptionNo().substring(0,2).equals("CM")){
                dose.add(new Dose(allPrescriptionDetail.get(i).getDrug().getDrugId(), allPrescriptionDetail.get(i).getDose(), "门诊发药",sendDrug.getSendNum()));
            }
        }

        //循环新增发药单
        for (SendDrug s : sendDrugs) {
            sendDrugMapper.addSendDrug(s);
        }

        //循环新增发药详单
        //循环修改药房药品库存数量
        for (Dose doses : dose) {
            doseMapper.addDose(doses);
            sendDrugMapper.updatePharmacyDetail(doses.getDoseSum(),doses.getDoseDrug());
        }
    }
}
