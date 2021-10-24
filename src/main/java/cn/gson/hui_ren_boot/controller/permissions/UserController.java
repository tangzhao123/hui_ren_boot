package cn.gson.hui_ren_boot.controller.permissions;

import cn.gson.hui_ren_boot.model.pojos.permissions.MD5;
import cn.gson.hui_ren_boot.model.pojos.permissions.UserInfo;
import cn.gson.hui_ren_boot.model.service.permissions.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    //登录
    @PostMapping("/login")
    public Object login(@RequestBody UserInfo user) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        UserInfo info = userService.login(user);
        if(MD5.validPassword(user.getUserPossword(),info.getUserPossword())){
            return info;
        }else{
            return "fail";
        }
    }

    @RequestMapping("/users")
    public List<UserInfo> seUser(UserInfo userInfo){
        return userService.seUser(userInfo);
    }


}
