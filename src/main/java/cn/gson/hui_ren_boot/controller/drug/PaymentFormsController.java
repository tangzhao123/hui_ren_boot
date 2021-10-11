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

    //查询上月的销售额
    @RequestMapping("all-paymentForm")
    public List<PaymentForm> allPayment(){
        return paymentFormsService.allPayment();
    }

//    //查询收费总金额
//    @RequestMapping("allPaymentMoneys")
//    public double allPaymentMoneys(){
//        return paymentFormsService.allPaymentMoneys();
//    }
//
//    //查询用户数量
//    @RequestMapping("allStaffSum")
//    public int allStaffSum(){
//        return paymentFormsService.allStaffSum();
//    }
//
//    //查询药品数量
//    @RequestMapping("allStockSurplus")
//    public int allStockSurplus(){
//        return paymentFormsService.allStockSurplus();
//    }
//
//    //查询出库数量
//    @RequestMapping("allStockoutAmount")
//    public int allStockoutAmount(){
//        return paymentFormsService.allStockoutAmount();
//    }
//
//    //查询入库数量
//    @RequestMapping("allDetailNumber")
//    public int allDetailNumber(){
//        return paymentFormsService.allDetailNumber();
//    }
}
