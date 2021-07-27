package cn.gson.hui_ren_boot.model.mapper.nursestation;

import cn.gson.hui_ren_boot.model.pojos.hospital.Record;
import cn.gson.hui_ren_boot.model.pojos.hospital.Register;
import cn.gson.hui_ren_boot.model.pojos.nursestation.SickbedEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SickbedMapper{
    //修改病床记录表
    public void updateRecord(Record record);

    //调换病床修改病床的状态
    public void updateTwo(String sickbedMark);

    //查询病床使用记录
    public List<Record> selectRecord();

    //修改病人资料，添加床位
    public void updateRegister(Register register);

    //新增病床使用记录
    public void addRecord(Record record);

    //修改病床状态
    public void updateSickbed(String sickbedMark);

    //查询病床
    public List<SickbedEntity> bingchuang(Long medicalIdf);

    //查询病人资料
    public List<Register> registerSelect();
}
