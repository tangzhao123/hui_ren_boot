package cn.gson.hui_ren_boot.controller.hjz;

import cn.gson.hui_ren_boot.model.pojos.hjz.Function;
import cn.gson.hui_ren_boot.model.service.hjz.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoleController {

    @Autowired
    RoleService roleService;

    //菜单栏的查询
    @GetMapping("/role-list")
    public Object login(Long userId){
        List<Function> functions = roleService.userRole(userId);
        return functions;
    }
}
