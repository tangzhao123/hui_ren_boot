package cn.gson.hui_ren_boot.controller;

import cn.gson.hui_ren_boot.model.pojos.Function;
import cn.gson.hui_ren_boot.model.pojos.UserInfo;
import cn.gson.hui_ren_boot.model.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoleController {

    @Autowired
    RoleService roleService;

    @GetMapping("/role-list")
    public Object login(Long userId){
        List<Function> functions = roleService.userRole(userId);
//        int user = roleService.user(userId);
//        List<Function> functions1 = roleService.userMenu((long) user);
//        System.out.println(functions.toString());
//        System.out.println(functions1.toString());
//        System.out.println(user);
        return functions;
    }
}
