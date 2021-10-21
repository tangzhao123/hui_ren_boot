package cn.gson.hui_ren_boot.controller.drug;

import cn.gson.hui_ren_boot.model.mapper.drug.PharmacyDetailMapper;
import cn.gson.hui_ren_boot.model.pojos.hospital.Advice;
import cn.gson.hui_ren_boot.model.pojos.hospital.Details;
import cn.gson.hui_ren_boot.model.pojos.nursestation.Orders;
import cn.gson.hui_ren_boot.model.pojos.outpatient.PaymentDetai;
import cn.gson.hui_ren_boot.model.pojos.outpatient.PaymentForm;
import cn.gson.hui_ren_boot.model.pojos.outpatient.PrescriptionDetail;
import cn.gson.hui_ren_boot.model.pojos.outpatient.PrescriptionList;
import cn.gson.hui_ren_boot.model.pojos.pharmacy.*;
import cn.gson.hui_ren_boot.model.service.drug.SendDrugService;
import com.alibaba.fastjson.JSONObject;
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

    @Autowired
    PharmacyDetailMapper pharmacyDetailMapper;

    //LinkedHashMap转list
    public static <T> List<T> linkedMapTypeListToObjectList(List<T> lst, Class<T> responseType) {
        // 处理linkedHashMap
        lst = JSONObject.parseArray(JSONObject.toJSONString(lst)).toJavaList(responseType);
        return lst;
    }


    //门诊发药的查询
    @RequestMapping("prescriptionList")
    public List<PrescriptionList> findAllPrescriptionList(String recordsNo) {
        List<PaymentForm> allPaymentForm = sendDrugService.findAllPaymentForm(recordsNo);
        List<PaymentDetai> allPaymentDetail = new ArrayList<>();//缴费详情的集合
        List<PrescriptionList> allPrescriptionList = new ArrayList<>();//处方单集合

        List<String> strings = new ArrayList<>();
        System.out.println(allPaymentForm);
        if (!allPaymentForm.isEmpty()) {
            //循环缴费记录表根据缴费记录号查询详情
            for (PaymentForm p : allPaymentForm) {
                strings.add(p.getPaymentNo());
            }
            System.out.println(strings);
            allPaymentDetail = sendDrugService.findAllPaymentDetail(strings);
            List<String> str = new ArrayList<>();//处方单号的集合
            List<SendDrug> allSendDrug = new ArrayList<>();
            List<String> st = new ArrayList<>();
            //根据缴费详情里面的处方单号去判断该处方单是否缴费，缴费的就进行发药
            for (PaymentDetai pay : allPaymentDetail) {
                str.add(pay.getPrescriptionNo());
                //如果处方单号不为空就进行查询
                if (pay.getPrescriptionNo() != null) {
                    //根据处方单号去查询发药记录表
                    st.add(pay.getPrescriptionNo());

                }
            }
            allSendDrug = sendDrugService.findAllSendDrug(st);
            System.err.println(allSendDrug);
            //如果没有发药记录才进行发药
            if (allSendDrug.isEmpty()) {
                allPrescriptionList = sendDrugService.findAllPrescriptionList(str);
            }
        }
        return allPrescriptionList;
    }

    //根据处方单号查询处方详单
    @RequestMapping("prescriptionDetail")
    public List<PrescriptionDetail> findAllPrescriptionDetail(String prescriptionNo) {
        return sendDrugService.findAllPrescriptionDetail(prescriptionNo);
    }

    //新增门诊发药记录
    @RequestMapping("add-send-drug")
    public String addSendDrug(@RequestBody Map<String, Object> datas) {
        try {
            sendDrugService.addSendDrug(datas);
            return "ok";
        } catch (Exception e) {
            e.printStackTrace();
            return "fail";
        }

    }

    //新增住院发药记录
    @RequestMapping("add-hospital-send-drug")
    public String addHospitalSendDrug(@RequestBody Map<String, Object> datas) {
        try {
            sendDrugService.addHospitalSendDrug(datas);
            return "ok";
        } catch (Exception e) {
            e.printStackTrace();
            return "fail";
        }

    }


    //医嘱发药的查询
    @RequestMapping("findAllOrders")
    public List<Advice> findAllOrders(@RequestBody Orders orders) {
        return sendDrugService.findAllOrders(orders);
    }

    //根据住院号查询已经执行的医嘱
    @RequestMapping("allDetails-list")
    public List<Details> allDetails(String registerId) {
        return sendDrugService.allDetails(registerId);
    }
}
