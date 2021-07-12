package cn.gson.hui_ren_boot.controller.permissions;

import cn.gson.hui_ren_boot.model.pojos.permissions.Function;
import cn.gson.hui_ren_boot.model.pojos.permissions.Roleinfo;
import cn.gson.hui_ren_boot.model.service.permissions.RoleInfoService;
import cn.gson.hui_ren_boot.model.service.permissions.RoleService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RoleInfoController {

    @Autowired
    RoleInfoService roleInfoService;

    @Autowired
    RoleService roleService;

    //分页模糊查询所有角色列表
    @GetMapping("roleInfo-list")
    public Object allRoleInfo(Integer pageNo, Integer size, String roleInfo){

        return roleInfoService.allRoleByPage(pageNo,size,roleInfo);
    }

    //查询所有的角色列表
    @GetMapping("role")
    public List<Roleinfo> findAllRole(){
        return roleInfoService.findAllRole();
    }

    //新增角色
    @RequestMapping("add-role")
    public String addNews(@RequestBody Roleinfo role){
        try {
           roleInfoService.addRole(role);
            return "ok";
        } catch (Exception e) {
            e.printStackTrace();
            return "fail";
        }
    }

    //查询所有权限
    @RequestMapping("fun-list")
    public List<Function> allFun(){
        return roleService.allFun();
    }

    //查询角色所拥有的权限
    @RequestMapping("role-fun")
    public List<Integer> allGrantFuns(Long roleId){
        return roleService.roleFun(roleId);
    }

    //给角色授权
    @PostMapping("save-grade")
    public void saveGrade(@RequestParam("grant") String grant){
        JSONObject o = JSONObject.parseObject(grant);
        Long roleId = Long.valueOf(o.get("roleId").toString());
        List<Long> fun = JSONArray.parseArray(o.get("funs").toString(),Long.TYPE);
        roleService.saveGrant(roleId,fun);
    }
}
