package cn.gson.hui_ren_boot.model.service.csp;

import cn.gson.hui_ren_boot.model.mapper.csp.OutRegisterMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OutRegisterService {
    @Autowired
    OutRegisterMapper outRegisterMapper;

    //分页查询
    public Object allRegisterByPage(Integer pageNo,Integer size){
        return outRegisterMapper.allRegister();
    }
}
