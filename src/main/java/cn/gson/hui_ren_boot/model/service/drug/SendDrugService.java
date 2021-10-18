package cn.gson.hui_ren_boot.model.service.drug;

import cn.gson.hui_ren_boot.model.mapper.drug.*;
import cn.gson.hui_ren_boot.model.pojos.hospital.Advice;
import cn.gson.hui_ren_boot.model.pojos.hospital.Details;
import cn.gson.hui_ren_boot.model.pojos.nursestation.Orders;
import cn.gson.hui_ren_boot.model.pojos.outpatient.PaymentDetai;
import cn.gson.hui_ren_boot.model.pojos.outpatient.PaymentForm;
import cn.gson.hui_ren_boot.model.pojos.outpatient.PrescriptionDetail;
import cn.gson.hui_ren_boot.model.pojos.outpatient.PrescriptionList;
import cn.gson.hui_ren_boot.model.pojos.pharmacy.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class SendDrugService {

    //LinkedHashMap转list
    public static <T> List<T> linkedMapTypeListToObjectList(List<T> lst, Class<T> responseType) {
        // 处理linkedHashMap
        lst = JSONObject.parseArray(JSONObject.toJSONString(lst)).toJavaList(responseType);
        return lst;
    }

    @Autowired
    SendDrugMapper sendDrugMapper;

    @Autowired
    DoseMapper doseMapper;

    @Autowired
    PharmacyDetailMapper pharmacyDetailMapper;

    @Autowired
    DrugMapper drugMapper;

    @Autowired
    ScatteredMapper scatteredMapper;


    //根据处方单号查询处方单
    public List<PrescriptionList> findAllPrescriptionList(List<String> prescriptionNo) {
        return sendDrugMapper.findAllPrescriptionList(prescriptionNo);
    }


    //根据处方单号查询处方详单
    public List<PrescriptionDetail> findAllPrescriptionDetail(String prescriptionNo) {
        return sendDrugMapper.findAllPrescriptionDetail(prescriptionNo);
    }

    //根据处方单号查询处方详单
    public List<PrescriptionDetail> findPrescriptionDetail(List<String> prescriptionNo) {
        return sendDrugMapper.findPrescriptionDetail(prescriptionNo);
    }

    //查询所有的缴费记录表
    public List<PaymentForm> findAllPaymentForm(String recordNo) {
        return sendDrugMapper.findAllPaymentForm(recordNo);
    }

    //根据缴费记录单号查询缴费详单
    public List<PaymentDetai> findAllPaymentDetail(List<String> paymentNo) {
        return sendDrugMapper.findAllPaymentDetail(paymentNo);
    }

    //查询处方单有没有发药记录
    public List<SendDrug> findAllSendDrug(String prescriptionNo) {
        return sendDrugMapper.findAllSendDrug(prescriptionNo);
    }


    //新增门诊发药单
    public void addSendDrug(Map<String, Object> datas) {
        List<String> list = (List<String>) datas.get("prescriptionNo");//处方单号
        String str = JSON.toJSONString(datas.get("sendDrug"));//发药实体对象
        SendDrug sendDrug = JSON.parseObject(str, SendDrug.class);
        List<Double> lists = (List<Double>) datas.get("sendPrice");//处方单的总金额
        List<SendDrug> sendDrugs = new ArrayList<>();//发药单的集合
        List<Dose> dose = new ArrayList<>();//发药详情的集合

        //发药单实体类
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).substring(0, 2).equals("WM")) {
                sendDrugs.add(new SendDrug(sendDrug.getSendNum(), 2L, lists.get(i), sendDrug.getSendPeople(), list.get(i)));
            } else if (list.get(i).substring(0, 2).equals("CM")) {
                sendDrugs.add(new SendDrug(sendDrug.getSendNum(), 1L, lists.get(i), sendDrug.getSendPeople(), list.get(i)));

            }
        }
        //根据处方单号查询处方详单
        List<PrescriptionDetail> allPrescriptionDetail = sendDrugMapper.findPrescriptionDetail(list);//处方详单的集合

        //根据处方详单生成发药详单
        for (int i = 0; i < allPrescriptionDetail.size(); i++) {
            if (allPrescriptionDetail.get(i).getPrescriptionNo().substring(0, 2).equals("WM")) {
                dose.add(new Dose(allPrescriptionDetail.get(i).getDrug().getDrugId(), allPrescriptionDetail.get(i).getAggregate(), "门诊发药", sendDrug.getSendNum()));
            } else if (allPrescriptionDetail.get(i).getPrescriptionNo().substring(0, 2).equals("CM")) {
                dose.add(new Dose(allPrescriptionDetail.get(i).getDrug().getDrugId(), allPrescriptionDetail.get(i).getDose(), "门诊发药", sendDrug.getSendNum()));
            }
        }

        //循环新增发药单
        for (SendDrug s : sendDrugs) {
            sendDrugMapper.addSendDrug(s);
        }

        //循环新增发药详单
        //循环修改药房药品库存数量
        for (Dose doses : dose) {
            long xuqiu = doses.getDoseSum();
            List<PharmacyDetail> pharmacyDetails = pharmacyDetailMapper.findAllPharmacyDetail(doses.getDoseDrug());//药房药品库存详情
            for (PharmacyDetail detail : pharmacyDetails) {
                if (xuqiu > 0) {
                    if (detail.getDetailInventory() > xuqiu) {
                        System.out.println(doses);
                        System.out.println(detail.getDetailBatch());
                        doseMapper.addDose(doses);
                        sendDrugMapper.updatePharmacyDetail(doses.getDoseSum(), detail.getDetailBatch());
                        xuqiu = detail.getDetailInventory() - xuqiu;
                        break;
                    }
                } else {
                    System.out.println(doses);
                    System.out.println(detail.getDetailBatch());
                    doseMapper.addDose(doses);
                    sendDrugMapper.updatePharmacyDetail(doses.getDoseSum(), detail.getDetailBatch());
                    xuqiu = detail.getDetailInventory() - xuqiu;
                }
            }

        }
    }

    //新增住院发药单
    public void addHospitalSendDrug(Map<String, Object> datas) {
        //接收前台传来的集合
        List<Advice> advice = (List<Advice>) datas.get("advice");
        String send = JSON.toJSONString(datas.get("sendDrug"));//发药实体对象
        SendDrug sendDrug = JSON.parseObject(send, SendDrug.class);
        List<SendDrug> sendDrugs = new ArrayList<>();//发药单的集合
        List<Dose> dose = new ArrayList<>();//发药详情的集合
        //拆零库存详情
        List<Scattered> scattereds = scatteredMapper.allScattered();
        System.err.println(scattereds);
        List<Advice> adviceList = new ArrayList<>();
        //转换成list集合
        adviceList = linkedMapTypeListToObjectList(advice, Advice.class);
        List<String> str = new ArrayList<>();
        //循环添加医嘱号
        for (Advice a : adviceList) {
            str.add(a.getAdviceId());
        }
        //根据医嘱号查询医嘱详情
        List<Details> allDetails = sendDrugMapper.findAllDetails(str);

        //查询所有的药品规格
        List<DrugInfoVo> drugInfoVos = sendDrugMapper.allDrug();

        //药品名称的集合
        List<String> drugName = new ArrayList<>();

        for (Details allDetail : allDetails) {
            drugName.add(allDetail.getDrugName());
        }

        //根据药品名称查询药品编号
        List<DrugInfo> drugById = drugMapper.findDrugById(drugName);

        //发药单
        for (DrugInfo drugInfo : drugById) {
            for (Details allDetail : allDetails) {
                if (drugInfo.getTypes().getTypeId() == 2) {
                    sendDrugs.add(new SendDrug(sendDrug.getSendNum(), 2L, allDetail.getDaralisNumber() * allDetail.getDaralisPrice(), sendDrug.getSendPeople(), allDetail.getAdviceId()));
                } else {
                    sendDrugs.add(new SendDrug(sendDrug.getSendNum(), 1L, allDetail.getDaralisNumber() * allDetail.getDaralisPrice(), sendDrug.getSendPeople(), allDetail.getAdviceId()));
                }
            }
        }
        //根据医嘱详单生成发药单
        for (Details allDetail : allDetails) {
            for (DrugInfo drugInfo : drugById) {
                for (DrugInfoVo drugInfoVo : drugInfoVos) {
                    if (allDetail.getDrugName().equals(drugInfo.getDrugName())) {
                        dose.add(new Dose(drugInfo.getDrugId(), allDetail.getDaralisNumber() / Integer.parseInt(drugInfoVo.getStandardName().substring(0, 2)) + 1, "住院发药", sendDrug.getSendNum()));
                    }
                }
            }
        }

        HashSet<Dose> hs = new HashSet<Dose>(dose); //此时已经去掉重复的数据保存在hashset中

        List<Dose> doseList = new ArrayList<>(hs);

        HashSet<SendDrug> hs1 = new HashSet<SendDrug>(sendDrugs); //此时已经去掉重复的数据保存在hashset中

        List<SendDrug> sendDrugList = new ArrayList<>(hs1);

        //循环新增发药单
        for (SendDrug s : sendDrugList) {
            sendDrugMapper.addSendDrug(s);
        }

        //新增发药详单
        for (Dose doses : doseList) {
            doseMapper.addDose(doses);
        }



        for (Details allDetail : allDetails) {
            List<PharmacyDetail> pharmacyDetails = pharmacyDetailMapper.findAllPharmacyDetail(allDetail.getDrugId());//药房药品库存详情
            for (Scattered scattered : scattereds) {
                if(scattered.getDrugName().equals(allDetail.getDrugName())){
                    if(scattered.getScNumber()>=allDetail.getDaralisNumber()){
                        System.err.println("库存数量足够");
                        scatteredMapper.scNumber(allDetail.getDaralisNumber(),scattered.getDrugBatch());
                    }else{
                        long xuqiu = (allDetail.getDaralisNumber() / Integer.parseInt(allDetail.getStandardName().substring(0, 2)) + 1);
                        for (PharmacyDetail pharmacyDetail : pharmacyDetails) {
                            if (xuqiu > 0) {
                                if (pharmacyDetail.getDetailInventory().intValue() >= xuqiu) {
                                    boolean bool = scattereds.stream().anyMatch(a -> a.getDrugBatch().equals(pharmacyDetail.getDetailBatch()));
                                    if(bool==true){
                                        scatteredMapper.scNumbers(Long.parseLong(allDetail.getStandardName().substring(0, 2))-allDetail.getDaralisNumber(),pharmacyDetail.getDetailBatch());
                                    }else{
                                        Scattered scattered1 =  new Scattered(allDetail.getDrugName(),Long.parseLong(allDetail.getStandardName().substring(0, 2))-allDetail.getDaralisNumber(),pharmacyDetail.getDetailBatch(),pharmacyDetail.getDetailDate());
                                        scatteredMapper.addScattered(scattered1);
                                    }
                                    sendDrugMapper.updatePharmacyDetail(xuqiu , pharmacyDetail.getDetailBatch());
                                    xuqiu = pharmacyDetail.getDetailInventory()-xuqiu;
                                    break;
                                }
                            } else {
                                sendDrugMapper.updatePharmacyDetail(xuqiu, pharmacyDetail.getDetailBatch());
                                xuqiu = xuqiu - pharmacyDetail.getDetailInventory().intValue();
                            }
                        }
                    }
                }
            }

        }

    }

    //医嘱发药的查询
    public List<Advice> findAllOrders(Orders orders) {
        String date = null;
        String date1 = null;
        if (orders.getDate() != null && orders.getDate1() != null) {
            SimpleDateFormat sf = new SimpleDateFormat("yyy-MM-dd");
            date = sf.format(orders.getDate());
            date1 = sf.format(orders.getDate1());
        }
        List<Advice> list = new ArrayList<>();
        List<Orders> allOrders = sendDrugMapper.findAllOrders(date, date1, orders.getMedicalId());

        for (Orders order : allOrders) {
            if (order.getAdvice() != null) {
                list.add(order.getAdvice());
            }
        }

        HashSet<Advice> hs = new HashSet<Advice>(list); //此时已经去掉重复的数据保存在hashset中

        List<Advice> advice = new ArrayList<>(hs);

        return advice;
    }

    //根据住院号查询已经执行的医嘱
    public List<Details> allDetails(String registerId) {
        return sendDrugMapper.allDetails(registerId);
    }

    //根据药品名称查询编号
    public List<DrugInfo> findDrugById(List<String> drugName) {
        return drugMapper.findDrugById(drugName);
    }

    //根据医嘱号查询医嘱详情
    public List<Details> findAllDetails(List<String> adviceId) {
        return sendDrugMapper.findAllDetails(adviceId);
    }


    //查询药品规格
    public List<DrugInfoVo> allDrug() {
        return sendDrugMapper.allDrug();
    }

}
