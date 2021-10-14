package cn.gson.hui_ren_boot.model.service.drug;

import cn.gson.hui_ren_boot.model.mapper.drug.PaymentFormsMapper;
import cn.gson.hui_ren_boot.model.pojos.outpatient.PaymentForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PaymentFormsService {

    @Autowired
    PaymentFormsMapper paymentFormsMapper;

    //查询每月的销售额
    public List<PaymentForm> allPaymentForm(){
        return paymentFormsMapper.allPaymentForm();
    }


    //查询上月的销售额
    public List<PaymentForm> allPayment(){
        return paymentFormsMapper.allPayment();
    }

    //查询收费总金额
    public double allPaymentMoneys(){
        return paymentFormsMapper.allPaymentMoneys();
    }

    //查询用户数量
    public int allStaffSum(){
        return paymentFormsMapper.allStaffSum();
    }

    //查询药品数量
    public int allStockSurplus(){
        return paymentFormsMapper.allStockSurplus();
    }

}
