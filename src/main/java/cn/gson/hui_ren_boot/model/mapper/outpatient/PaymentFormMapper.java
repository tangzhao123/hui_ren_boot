package cn.gson.hui_ren_boot.model.mapper.outpatient;

import cn.gson.hui_ren_boot.model.pojos.outpatient.PaymentForm;
import cn.gson.hui_ren_boot.model.pojos.outpatient.PaymentVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 缴费表
 */
@Mapper
public interface PaymentFormMapper {
    //新增缴费记录
    public void addPayment(PaymentForm paymentForm);

    //查询缴费记录
    public List<PaymentVo> selPayment();
}
