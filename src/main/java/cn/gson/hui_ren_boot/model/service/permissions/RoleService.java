package cn.gson.hui_ren_boot.model.service.permissions;


import cn.gson.hui_ren_boot.model.dao.permissions.FunctionDao;
import cn.gson.hui_ren_boot.model.dao.permissions.RoleInfoDao;
import cn.gson.hui_ren_boot.model.mapper.permissions.RoleMapper;
import cn.gson.hui_ren_boot.model.pojos.permissions.Function;
import cn.gson.hui_ren_boot.model.pojos.permissions.Roleinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class RoleService {

    @Autowired
    RoleMapper roleMapper;
    @Autowired
    RoleInfoDao roleInfoDao;
    @Autowired
    FunctionDao functionDao;

    //查询菜单栏
    public List<Function> userRole(Long userId){
        return roleMapper.userRole(userId);
    }

    //查询一级的功能
    public List<Function> allFun(){
        //查询所有的一级功能然后给他的子级赋值
        List<Function> firstFun = roleMapper.allFuns();
        for (Function function : firstFun) {
            function.setChildren(childrenFun(function.getAuthityId()));
        }
        return  firstFun;
    }

    //查询子级功能列表
    public List<Function> childrenFun(Long authityLeadaers){
            List<Function> childrenFun = roleMapper.childrenFuns(authityLeadaers);
        for (Function children : childrenFun) {
            children.setChildren(childrenFun(children.getAuthityId()));
        }
        return childrenFun;
    }

    //查询角色所拥有的权限
    public List<Integer> roleFun(Long roleinfoId){
        return roleMapper.roleFuns(roleinfoId);
    }

    //给角色授权
    public void saveGrant(Long roleId,List<Long> fun){
        Roleinfo roleinfo  = roleInfoDao.findById(roleId).get();//根据角色编号查询角色
        List<Function> allById = (List<Function>) functionDao.findAllById(fun);//根据权限编号查询权限
        System.out.println(allById);
        List<Function> functions = roleinfo.getFunc();
        System.out.println(functions);
        //如果集合是空的就new一个
        if(functions == null){
            functions = new ArrayList<>();
        }
        functions.clear();//清空原来的数据
        functions.addAll(allById);//把查询到的权限编号添加到集合
        roleinfo.setFunc(functions);//触发中间表的新增
    }

}
