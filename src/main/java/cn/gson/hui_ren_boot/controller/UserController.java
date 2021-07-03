package cn.gson.hui_ren_boot.controller;

import cn.gson.hui_ren_boot.model.pojos.UserInfo;
import cn.gson.hui_ren_boot.model.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class UserController {

    @Autowired
    UserService userService;

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
