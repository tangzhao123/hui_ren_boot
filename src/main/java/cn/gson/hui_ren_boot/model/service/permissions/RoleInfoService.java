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

    //查询一级角色
    public List<Roleinfo> allRole(){
        //查询所有的一级角色然后给他的子级赋值
        List<Roleinfo> firstRole = roleInfoMapper.allRoleInfo();
        for (Roleinfo roleinfo : firstRole) {
            roleinfo.setRoleinfos(childrenRole(roleinfo.getRoleinfoId()));
        }
        return firstRole;
    }

    //查询子级角色
    public List<Roleinfo> childrenRole(Long roleinfoId){
        List<Roleinfo> childrenRole = roleInfoMapper.childrenRole(roleinfoId);
        for (Roleinfo roleinfo : childrenRole) {
            roleinfo.setRoleinfos(childrenRole(roleinfo.getRoleinfoId()));
        }
        return childrenRole;
    }

    //查询用户已经拥有的角色
    public List<Integer> userRole(Long userId){
        return roleInfoMapper.userRole(userId);
    }
}
