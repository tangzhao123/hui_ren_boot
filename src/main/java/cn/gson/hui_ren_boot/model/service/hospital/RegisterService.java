package cn.gson.hui_ren_boot.model.service.hospital;

import cn.gson.hui_ren_boot.model.mapper.hospital.RegisterDao;
import cn.gson.hui_ren_boot.model.mapper.hospital.RegisterMapper;
import cn.gson.hui_ren_boot.model.mapper.outpatient.TreatmentCardMapper;
import cn.gson.hui_ren_boot.model.pojos.hospital.Register;
import cn.gson.hui_ren_boot.model.pojos.outpatient.OutpatientRegister;
import cn.gson.hui_ren_boot.model.pojos.outpatient.TreatmentCard;
import org.junit.validator.PublicClassValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RegisterService {
    @Autowired
    RegisterMapper registerMapper;
    @Autowired
    RegisterDao registerDao;
    @Autowired
    TreatmentCardMapper treatmentCardMapper;
    public Object allRegisByPage(Integer pageNo, Integer size, Register inputboxs){
        return registerMapper.allRegis(inputboxs);
    }

    public void saveRegis(Register j){
        registerDao.save(j);
    }
    public void addRegister(Register ter){
        registerMapper.addRegister(ter);
    }
    public void addtreatmentCard(TreatmentCard tra){
        treatmentCardMapper.addCard(tra);
    }
    public Register allRegiMedical(String clinic,String id){//修改时查询诊疗卡
       return registerMapper.allRegiMedical(clinic,id);
    }
}
