package cn.gson.hui_ren_boot.model.service.permissions;

import cn.gson.hui_ren_boot.model.dao.permissions.RoleInfoDao;
import cn.gson.hui_ren_boot.model.dao.permissions.UserInfoDao;
import cn.gson.hui_ren_boot.model.mapper.permissions.RoleInfoMapper;

import cn.gson.hui_ren_boot.model.pojos.permissions.Roleinfo;

import cn.gson.hui_ren_boot.model.pojos.permissions.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class RoleInfoService {

    @Autowired
    RoleInfoMapper roleInfoMapper;
    @Autowired
    RoleInfoDao roleInfoDao;

    @Autowired
    UserInfoDao userInfoDao;
    

    //分页查询所有角色
    public Object allRoleByPage(Integer  pageNo,Integer size,String roleinfo){
        return roleInfoMapper.allRole(roleinfo);
    }

    //查询所有的角色
    public List<Roleinfo> findAllRole(){
        return roleInfoMapper.findAllRole();
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

    //授权
    public void saveGrant(Long userId,List<Long> role){
          UserInfo userInfo = userInfoDao.findById(userId).get();//根据用户编号查询用户
          List<Roleinfo> allById = (List<Roleinfo>) roleInfoDao.findAllById(role);//根据角色编号查询角色

          List<Roleinfo> roles = userInfo.getRoleinfos();
          if(roles==null){
              roles = new ArrayList<>();
          }

          roles.clear();//清空原来的数据
          roles.addAll(allById);//把查询到的角色编号添加到集合
          userInfo.setRoleinfos(roles);//出发中间表的新增
    }
}
