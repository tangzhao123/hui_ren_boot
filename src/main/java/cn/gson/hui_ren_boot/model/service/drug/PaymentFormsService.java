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
}
