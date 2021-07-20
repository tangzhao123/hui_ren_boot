package cn.gson.hui_ren_boot.model.service.permissions;

import cn.gson.hui_ren_boot.model.mapper.permissions.FunctionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FunctionService {

    @Autowired
    FunctionMapper functionMapper;

    //分页模糊查询权限
    public Object findAllFunctionByPage(Integer pageNo,Integer size,String search){
        return functionMapper.findAllFunction(search);
    }
}
