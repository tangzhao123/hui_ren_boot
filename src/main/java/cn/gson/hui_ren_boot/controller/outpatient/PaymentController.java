package cn.gson.hui_ren_boot.controller.outpatient;

import cn.gson.hui_ren_boot.model.pojos.outpatient.PrescriptionDetail;
import cn.gson.hui_ren_boot.model.pojos.outpatient.PrescriptionList;
import cn.gson.hui_ren_boot.model.service.outpatient.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 收费
 */
@RestController
@RequestMapping("/outpatient")
public class PaymentController {
    @Autowired
    PaymentService paymentService;

    @RequestMapping("/all-list")
    public List<PrescriptionList> allList(String recordNo){
        return paymentService.allList(recordNo);
    }

    @RequestMapping("/sel-list")
    public List<PrescriptionDetail> selList(String prescriptionNo){
        return paymentService.selNo(prescriptionNo);
    }
}
