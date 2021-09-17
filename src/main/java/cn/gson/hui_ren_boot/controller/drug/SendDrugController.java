package cn.gson.hui_ren_boot.controller.drug;

import cn.gson.hui_ren_boot.model.pojos.outpatient.PaymentDetai;
import cn.gson.hui_ren_boot.model.pojos.outpatient.PaymentForm;
import cn.gson.hui_ren_boot.model.pojos.outpatient.PrescriptionDetail;
import cn.gson.hui_ren_boot.model.pojos.outpatient.PrescriptionList;
import cn.gson.hui_ren_boot.model.pojos.pharmacy.Dose;
import cn.gson.hui_ren_boot.model.pojos.pharmacy.SendDrug;
import cn.gson.hui_ren_boot.model.service.drug.SendDrugService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/Drug")
public class SendDrugController {

    @Autowired
    SendDrugService sendDrugService;


    //门诊发药的查询
    @RequestMapping("prescriptionList")
    public List<PrescriptionList> findAllPrescriptionList(String recordsNo){
        List<PaymentForm> allPaymentForm = sendDrugService.findAllPaymentForm(recordsNo);
        List<PaymentDetai> allPaymentDetail = new ArrayList<>();//缴费详情的集合
        List<PrescriptionList> allPrescriptionList = new ArrayList<>();//处方单集合
        if(!allPaymentForm.isEmpty()){
            //循环缴费记录表根据缴费记录号查询详情
            for (PaymentForm p : allPaymentForm) {
                allPaymentDetail = sendDrugService.findAllPaymentDetail(p.getPaymentNo());
            }
            List<String> str = new ArrayList<>();//处方单号的集合
            List<SendDrug> allSendDrug = new ArrayList<>();
            //根据缴费详情里面的处方单号去判断该处方单是否缴费，缴费的就进行发药
            for (PaymentDetai pay : allPaymentDetail) {
                str.add(pay.getPrescriptionNo());
                //如果处方单号不为空就进行查询
               if(pay.getPrescriptionNo()!=null){
                   //根据处方单号去查询发药记录表
                   allSendDrug = sendDrugService.findAllSendDrug(pay.getPrescriptionNo());
               }
            }
            //如果没有发药记录才进行发药
            if(allSendDrug.isEmpty()){
                allPrescriptionList = sendDrugService.findAllPrescriptionList(str);
            }
        }
        return allPrescriptionList;
    }

    //根据处方单号查询处方详单
    @RequestMapping("prescriptionDetail")
    public List<PrescriptionDetail> findAllPrescriptionDetail(String prescriptionNo){
        return sendDrugService.findAllPrescriptionDetail(prescriptionNo);
    }

    //新增发药记录
    @RequestMapping("add-send-drug")
    public String addSendDrug(@RequestBody Map<String,Object> datas){
        try {
            sendDrugService.addSendDrug(datas);
            return "ok";
        } catch (Exception e) {
            e.printStackTrace();
            return "fail";
        }

    }
}
