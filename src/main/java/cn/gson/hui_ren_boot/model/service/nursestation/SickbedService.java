package cn.gson.hui_ren_boot.model.service.nursestation;

import cn.gson.hui_ren_boot.model.mapper.nursestation.SickbedMapper;
import cn.gson.hui_ren_boot.model.pojos.hospital.Sickbed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SickbedService {
    @Autowired
    SickbedMapper sickbedMapper;//病床mapper

    public List<Sickbed> selSickbed(){
        return sickbedMapper.selSickbed();
    }
}
