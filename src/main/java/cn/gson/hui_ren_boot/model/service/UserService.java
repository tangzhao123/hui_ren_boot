package cn.gson.hui_ren_boot.model.service;

import cn.gson.hui_ren_boot.model.mapper.UserMapper;
import cn.gson.hui_ren_boot.model.pojos.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserService {

    @Autowired
    UserMapper userMapper;

    //登录
    public UserInfo login(UserInfo user){
        return userMapper.allUser(user);
    }
}
