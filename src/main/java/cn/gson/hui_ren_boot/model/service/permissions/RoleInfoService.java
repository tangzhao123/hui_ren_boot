package cn.gson.hui_ren_boot.model.service.permissions;

import cn.gson.hui_ren_boot.model.dao.permissions.RoleInfoDao;
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
    @Autowired
    RoleInfoDao roleInfoDao;
    

    //分页查询所有角色
    public Object allRoleByPage(Integer  pageNo,Integer size,String roleinfo){
        return roleInfoMapper.allRole(roleinfo);
    }

    //新增或修改角色
    public void addRole(Roleinfo roleinfo){
        roleInfoDao.save(roleinfo);
    }


}
