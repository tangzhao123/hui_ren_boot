package cn.gson.hui_ren_boot.model.service.outpatient;

import cn.gson.hui_ren_boot.model.mapper.outpatient.OutRegisterMapper;
import cn.gson.hui_ren_boot.model.pojos.outpatient.OutpatientRegister;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 门诊患者库
 */
@Service
@Transactional
public class OutRegisterService {
    @Autowired
    OutRegisterMapper outRegisterMapper;

    //多条件分页查询
    public Object allRegisterByPage(Integer pageNo, Integer size, OutpatientRegister outpatientRegister){
        return outRegisterMapper.allRegister(outpatientRegister);
    }
}
