package cn.gson.hui_ren_boot.model.mapper.outpatient;

import cn.gson.hui_ren_boot.model.pojos.outpatient.PrescriptionDetail;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 缴费详情表
 */
@Mapper
public interface PaymentDetaiMapper {
    public void addPaymentDetail(List<PrescriptionDetail> prescriptionDetails,String paymentNo);
}