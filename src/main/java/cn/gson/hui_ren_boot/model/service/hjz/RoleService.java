package cn.gson.hui_ren_boot.model.service.hjz;


import cn.gson.hui_ren_boot.model.mapper.hjz.RoleMapper;
import cn.gson.hui_ren_boot.model.pojos.hjz.Function;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class RoleService {

    @Autowired
    RoleMapper roleMapper;

    //查询菜单栏
    public List<Function> userRole(Long userId){
        return roleMapper.userRole(userId);
    }

}
