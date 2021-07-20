package cn.gson.hui_ren_boot.model.mapper.outpatient;

import cn.gson.hui_ren_boot.model.pojos.outpatient.MedicalRecordInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * 就诊记录
 */
@Mapper
public interface MedicalRecordInfoMapper {
    //新增就诊记录
    public void addInfo(MedicalRecordInfo medicalRecordInfo);
}
