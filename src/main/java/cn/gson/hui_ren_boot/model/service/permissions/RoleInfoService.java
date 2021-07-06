package cn.gson.hui_ren_boot.model.service.permissions;

import cn.gson.hui_ren_boot.model.mapper.permissions.RoleInfoMapper;
import cn.gson.hui_ren_boot.model.pojos.permissions.Roleinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class RoleInfoService {

    @Autowired
    RoleInfoMapper roleInfoMapper;

    //分页查询所有角色
    public List<Roleinfo> allRoleByPage(Integer  pageNo,Integer size,Roleinfo roleinfo){
        return roleInfoMapper.allRole(roleinfo);
    }
}
