package cn.gson.hui_ren_boot.model.service.hospital;

import cn.gson.hui_ren_boot.model.mapper.hospital.MedicalsMapper;
import cn.gson.hui_ren_boot.model.pojos.permissions.Medical;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MedicalsService {
    @Autowired
    MedicalsMapper medicalMapper;
    public List<Medical>allMedical(){
        return medicalMapper.allMedica();
    }

}
