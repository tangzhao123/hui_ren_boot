package cn.gson.hui_ren_boot.controller.permissions;

import cn.gson.hui_ren_boot.model.pojos.permissions.UserInfo;
import cn.gson.hui_ren_boot.model.service.permissions.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    //登录
    @PostMapping("/login")
    public Object login(@RequestBody UserInfo user){
        UserInfo info = userService.login(user);
        if(info != null){
            return info;
        }else{
            return "fail";
        }
    }

}
