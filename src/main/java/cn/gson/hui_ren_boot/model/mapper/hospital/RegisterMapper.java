package cn.gson.hui_ren_boot.model.mapper.hospital;

import cn.gson.hui_ren_boot.model.pojos.hospital.Register;
import cn.gson.hui_ren_boot.model.pojos.outpatient.OutpatientRegister;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface RegisterMapper {
    public List<Register> allRegis(Register inputboxs);//查询分页
    public void addRegister(Register ter);//新增
    public Register allRegiMedical(@Param("registerClinic") String clinic ,@Param("registerId")String id);//修改查询诊疗卡
}
