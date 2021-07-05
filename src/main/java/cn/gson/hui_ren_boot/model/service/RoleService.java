package cn.gson.hui_ren_boot.model.service;


import cn.gson.hui_ren_boot.model.mapper.RoleMapper;
import cn.gson.hui_ren_boot.model.pojos.Function;
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

    //查询导航栏
    public List<Function> userMenu(Long roleinfoId){
        return roleMapper.userMenu(roleinfoId);
    }

    //根据用户查询角色编号
    public Integer user(Long userId){
        return roleMapper.user(userId);
    }
}
