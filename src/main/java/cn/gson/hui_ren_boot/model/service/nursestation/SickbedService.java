package cn.gson.hui_ren_boot.model.service.nursestation;

import cn.gson.hui_ren_boot.model.mapper.nursestation.SickbedMapper;
import cn.gson.hui_ren_boot.model.pojos.hospital.Record;
import cn.gson.hui_ren_boot.model.pojos.hospital.Register;
import cn.gson.hui_ren_boot.model.pojos.nursestation.SickbedEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SickbedService {
    @Autowired
    SickbedMapper sickbedMapper;//病床mapper

    //修改病床记录表
    public void updateRecord(Record record){
        sickbedMapper.updateRecord(record);
    }

    //调换病床修改病床的状态
    public void updateTwo(String sickbedMark){
        sickbedMapper.updateTwo(sickbedMark);
    }

    //查询病床使用记录
    public List<Record> selectRecord(){
        return sickbedMapper.selectRecord();
    }

    //修改病人资料，添加床位
    public void updateRegister(Register register){
        sickbedMapper.updateRegister(register);
    }

    //新增病床使用记录表
    public void addRecord(Record record){
        sickbedMapper.addRecord(record);
    }

    //修改病床的状态
    public void updateSickbed(String sickbedMark){
        sickbedMapper.updateSickbed(sickbedMark);
    }

    //查询病人资料
    public List<Register> registerSelect(){
        return sickbedMapper.registerSelect();
    }

    //查询病床
    public List<SickbedEntity> bingchuang(Long medicalId){
        return  sickbedMapper.bingchuang(medicalId);
    }
}
