package cn.gson.hui_ren_boot.model.service.permissions;

import cn.gson.hui_ren_boot.model.mapper.permissions.UserMapper;
import cn.gson.hui_ren_boot.model.pojos.permissions.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserService {

    @Autowired
    UserMapper userMapper;

    //登录
    public UserInfo login(UserInfo user){
        return userMapper.allUser(user);
    }
    public List<UserInfo> seUser(UserInfo userInfo){
        return userMapper.seUser(userInfo);
    }
}
