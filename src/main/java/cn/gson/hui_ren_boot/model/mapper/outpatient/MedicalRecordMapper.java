package cn.gson.hui_ren_boot.model.mapper.outpatient;

import cn.gson.hui_ren_boot.model.pojos.outpatient.MedicalRecord;
import org.apache.ibatis.annotations.Mapper;

/**
 * 门诊病历
 */
@Mapper
public interface MedicalRecordMapper {
    //新增门诊病历
    public void addRecord(MedicalRecord medicalRecord);
}
