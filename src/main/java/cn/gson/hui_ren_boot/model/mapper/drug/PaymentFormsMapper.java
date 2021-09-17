package cn.gson.hui_ren_boot.model.mapper.drug;

import cn.gson.hui_ren_boot.model.pojos.outpatient.PaymentForm;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PaymentFormsMapper {

    //查询每月的销售额
    public List<PaymentForm> allPaymentForm();
}
