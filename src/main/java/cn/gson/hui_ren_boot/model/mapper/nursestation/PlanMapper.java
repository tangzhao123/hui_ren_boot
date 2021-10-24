package cn.gson.hui_ren_boot.model.mapper.nursestation;

import cn.gson.hui_ren_boot.model.pojos.hospital.Record;
import cn.gson.hui_ren_boot.model.pojos.hospital.Register;
import cn.gson.hui_ren_boot.model.pojos.hospital.Sickbed;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PlanMapper {

    //修改病床的状态，改为0未使用
    public void xinupdateOne(@Param("sickbedMark") String sickbedMark);

    //调换病床后修改病床的状态，1已使用
    public void xinupdateTwo(@Param("sickbedMark") String sickbedMark);

    //修改病人资料
    public void xinupdateRegister(@Param("sickbedMark") String sickbedMark, @Param("registerId") String registerId);

    //修改病床使用记录
    public void xinRecordupdate(@Param("sickbedMark") String sickbedMark,@Param("registerId") String registerId);

    //查询病床使用记录
    public List<Record> chaRecords(@Param("registerId") String registerId);

    //新增病床使用记录
    public  void xinRecord(Record record);

//    根据病人所在的科室查询病床
    public List<Sickbed> chabedss(@Param("medicalId") Long medicalId);

//    查询住院病人并且床位为空
    public List<Register> chabing(Register register);
}
