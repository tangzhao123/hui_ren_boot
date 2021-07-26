package cn.gson.hui_ren_boot.model.service.nursestation;

import cn.gson.hui_ren_boot.model.mapper.nursestation.SickbedMapper;
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

    //查询病人资料
    public List<Register> registerSelect(){
        return sickbedMapper.registerSelect();
    }

    //查询病床
    public List<SickbedEntity> bingchuang(Long medicalId){
        return  sickbedMapper.bingchuang(medicalId);
    }
}
