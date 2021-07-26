package cn.gson.hui_ren_boot.model.mapper.nursestation;

import cn.gson.hui_ren_boot.model.pojos.hospital.Register;
import cn.gson.hui_ren_boot.model.pojos.nursestation.SickbedEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SickbedMapper{

    //查询病床
    public List<SickbedEntity> bingchuang(Long medicalIdf);

    //查询病人资料
    public List<Register> registerSelect();
}
