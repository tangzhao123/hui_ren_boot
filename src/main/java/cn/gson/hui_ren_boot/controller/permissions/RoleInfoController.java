package cn.gson.hui_ren_boot.controller.permissions;

import cn.gson.hui_ren_boot.model.pojos.permissions.Roleinfo;
import cn.gson.hui_ren_boot.model.service.permissions.RoleInfoService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleInfoController {

    @Autowired
    RoleInfoService roleInfoService;

    //查询所有角色列表
    public Object allRoleInfo(Integer pageNo, Integer size, String roleInfo){
        Roleinfo role = JSONObject.toJavaObject(JSON.parseObject(roleInfo), Roleinfo.class);
        System.out.println(role);
        return roleInfoService.allRoleByPage(pageNo,size,role);
    }
}
