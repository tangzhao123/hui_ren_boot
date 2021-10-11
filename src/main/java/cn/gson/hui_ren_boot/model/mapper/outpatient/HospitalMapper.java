package cn.gson.hui_ren_boot.model.mapper.outpatient;

import cn.gson.hui_ren_boot.model.pojos.hospital.Hospital;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HospitalMapper {
    //新增住院申请
    public void addHospital(Hospital hospital);
}
