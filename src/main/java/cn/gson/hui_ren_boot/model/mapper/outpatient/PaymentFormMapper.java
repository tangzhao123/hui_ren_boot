package cn.gson.hui_ren_boot.model.mapper.outpatient;

import cn.gson.hui_ren_boot.model.pojos.outpatient.PaymentForm;
import org.apache.ibatis.annotations.Mapper;

/**
 * 缴费表
 */
@Mapper
public interface PaymentFormMapper {
    public void addPayment(PaymentForm paymentForm);
}
