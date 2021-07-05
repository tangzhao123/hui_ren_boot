package cn.gson.hui_ren_boot.model.service;

import cn.gson.hui_ren_boot.model.mapper.OutRegisterMapper;
import cn.gson.hui_ren_boot.model.pojos.OutpatientRegister;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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
