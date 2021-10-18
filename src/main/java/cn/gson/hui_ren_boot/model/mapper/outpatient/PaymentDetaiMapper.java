package cn.gson.hui_ren_boot.model.mapper.outpatient;

import cn.gson.hui_ren_boot.model.pojos.outpatient.PaymentDetai;
import cn.gson.hui_ren_boot.model.pojos.outpatient.PrescriptionDetail;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 缴费详情表
 */
@Mapper
public interface PaymentDetaiMapper {
    //新增缴费详情
    public void addPaymentDetail(List<PrescriptionDetail> prescriptionDetails,String paymentNo);

    //根据缴费号查询缴费详单
    public List<PaymentDetai> selPaymentDetail(String paymentNo);
}
