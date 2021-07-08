package cn.gson.hui_ren_boot.model.service.permissions;

import cn.gson.hui_ren_boot.model.mapper.permissions.MedicalMapper;
import cn.gson.hui_ren_boot.model.pojos.permissions.Medical;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MedicalService {

    @Autowired
    MedicalMapper medicalMapper;
    //查询所有的科室
    public List<Medical> allMedical(){
        return  medicalMapper.allMedical();
    }

    //根据名称查询编号
    public int byMedicalId(String medicalName){
        return medicalMapper.byMedicalId(medicalName);
    }
}
