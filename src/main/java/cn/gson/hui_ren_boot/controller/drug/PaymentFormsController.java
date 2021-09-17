package cn.gson.hui_ren_boot.controller.drug;

import cn.gson.hui_ren_boot.model.pojos.outpatient.PaymentForm;
import cn.gson.hui_ren_boot.model.service.drug.PaymentFormsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Drug")
public class PaymentFormsController {

    @Autowired
    PaymentFormsService paymentFormsService;

    //查询每月的销售额
    @RequestMapping("paymentForm")
    public List<PaymentForm> allPaymentForm(){
        return paymentFormsService.allPaymentForm();
    }
}
