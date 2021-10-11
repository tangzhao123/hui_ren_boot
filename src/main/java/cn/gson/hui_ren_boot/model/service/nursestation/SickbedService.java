package cn.gson.hui_ren_boot.model.service.nursestation;

import cn.gson.hui_ren_boot.model.dao.medical.WardDao;
import cn.gson.hui_ren_boot.model.mapper.nursestation.SickbedMapper;
import cn.gson.hui_ren_boot.model.pojos.hospital.Record;
import cn.gson.hui_ren_boot.model.pojos.hospital.Register;
import cn.gson.hui_ren_boot.model.pojos.hospital.Sickbed;
import cn.gson.hui_ren_boot.model.pojos.hospital.Ward;
import cn.gson.hui_ren_boot.model.pojos.nursestation.SickbedEntity;
import cn.gson.hui_ren_boot.model.pojos.nursestation.WardEntity;
import cn.gson.hui_ren_boot.model.pojos.permissions.Staff;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SickbedService {
    @Autowired
    SickbedMapper sickbedMapper;//病床mapper

    //查询病床
    public List<Sickbed> selectbed(String wardMark){
        return sickbedMapper.selectbed(wardMark);
    }

    //新增病床
    public void insertbed(Sickbed sickbed){
        sickbedMapper.insertbed(sickbed);
    }


    //修改病房
    public void updateWard(Ward ward){
        sickbedMapper.updateWard(ward);
    }

    //根据不同条件查询病房
    public Object selectWardByPage(int pageNo,int size,WardEntity wardEntity){
        return sickbedMapper.selectWard(wardEntity);
    }


    //新增病房
    public void addWard(Ward ward) {
        sickbedMapper.addWard(ward);
    }

    //查询不同科室的护士
    public List<Staff> staffHu(Long medicalId){
        return sickbedMapper.staffHu(medicalId);
    }

    //修改病床记录表
    public void updateRecord(Record record){
        sickbedMapper.updateRecord(record);
    }

    //调换病床修改病床的状态
    public void updateTwo(String sickbedMark){
        sickbedMapper.updateTwo(sickbedMark);
    }

    //查询病床使用记录
    public Object selectRecordByPage(int pageNo,int size,Record record){
        return sickbedMapper.selectRecord(record);
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
