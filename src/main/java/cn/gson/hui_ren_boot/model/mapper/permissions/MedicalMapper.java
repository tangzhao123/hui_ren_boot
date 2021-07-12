package cn.gson.hui_ren_boot.model.mapper.permissions;

import cn.gson.hui_ren_boot.model.pojos.permissions.Medical;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MedicalMapper {

    //查询所有的科室
    public List<Medical> allMedical();

    //根据名称查询编号
    public int byMedicalId(String medicalName);

    //查询所有的科室
    public List<Medical> byName(String medicalName);
}
