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
    public Object allhosptialByPage(Integer pageNo, Integer size, Hospital inputboxt){//分页查询
            return hosptialMapper.allHosptial(inputboxt);
    }
    public Hospital allspital(String idCard){//出重
        return  hosptialMapper.allSptal(idCard);
    }
    public void addHostp(Hospital add){//新增
        hosptialMapper.addHostp(add);
    }
    public void upHostp(Hospital up){//修改

        hosptialMapper.upHostp(up);
    }
    public void deHostp(int HospitalId){//删除
            hosptialMapper.deHostp(HospitalId);
    }
    public void upHostpState(Hospital state){//修改申请状态
        hosptialMapper.upHostpState(state);
    }

}
