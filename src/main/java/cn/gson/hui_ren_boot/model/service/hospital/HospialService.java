package cn.gson.hui_ren_boot.model.service.hospital;

import cn.gson.hui_ren_boot.model.mapper.hospital.HosptialDao;
import cn.gson.hui_ren_boot.model.mapper.hospital.HosptialMapper;
import cn.gson.hui_ren_boot.model.pojos.hospital.Hospital;
import cn.gson.hui_ren_boot.model.pojos.hospital.Register;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class HospialService {
    @Autowired
    HosptialDao hosptialDao;
    @Autowired
    HosptialMapper hosptialMapper;
    public void  saveHospoal(Hospital k){//添加住院申请表
        hosptialDao.save(k);

    }
    public Object allhosptialByPage(Integer pageNo, Integer size, Hospital inputboxt){
            return hosptialMapper.allHosptial(inputboxt);
    }
}
