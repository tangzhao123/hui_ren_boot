package cn.gson.hui_ren_boot.model.mapper.outpatient;

import cn.gson.hui_ren_boot.model.pojos.outpatient.PaymentForm;
import cn.gson.hui_ren_boot.model.pojos.outpatient.PaymentVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 缴费表
 */
@Mapper
public interface PaymentFormMapper {
    //新增缴费记录
    public void addPayment(PaymentForm paymentForm);

    //查询缴费记录
    public List<PaymentVo> selPayment(@Param("start") String start,@Param("end")String end,@Param("paymentType")long paymentType,@Param("outpatientName")String outpatientName,@Param("staffName")String staffName);

    //挂号时新增收费表
    public void sendPayment(PaymentForm paymentForm);
}
