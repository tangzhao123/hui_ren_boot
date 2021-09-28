package cn.gson.hui_ren_boot.model.mapper.outpatient;

import org.apache.ibatis.annotations.Mapper;

/**
 * 诊疗卡挂失
 */
@Mapper
public interface TreatmentLossMapper {
    //新增诊疗卡挂失
    public void addLoss(String treatmentNo);

    //解锁，删除挂失记录
    public void delLoss(String treatmentNo);
}
