package cn.gson.hui_ren_boot.model.service.hospital;

import cn.gson.hui_ren_boot.model.mapper.hospital.RegisterDao;
import cn.gson.hui_ren_boot.model.mapper.hospital.RegisterMapper;
import cn.gson.hui_ren_boot.model.pojos.hospital.Register;
import cn.gson.hui_ren_boot.model.pojos.outpatient.OutpatientRegister;
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
    public Object allRegisByPage(Integer pageNo, Integer size, Register inputboxs){
        return registerMapper.allRegis(inputboxs);
    }

    public void saveRegis(Register j){
        registerDao.save(j);
    }
}
