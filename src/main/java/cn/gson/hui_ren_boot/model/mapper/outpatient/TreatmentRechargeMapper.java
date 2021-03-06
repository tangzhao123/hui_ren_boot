package cn.gson.hui_ren_boot.model.mapper.outpatient;

import cn.gson.hui_ren_boot.model.pojos.outpatient.TreatmentRecharge;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 诊疗卡充值记录
 */
@Mapper
public interface TreatmentRechargeMapper {
    //新增诊疗卡充值记录
    public void addCharge(TreatmentRecharge treatmentRecharge);

    //查询账单
    public List<TreatmentRecharge> selRecharge(String treatmentNo);
}
