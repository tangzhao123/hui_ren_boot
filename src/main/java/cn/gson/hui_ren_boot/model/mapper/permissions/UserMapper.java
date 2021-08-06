package cn.gson.hui_ren_boot.model.mapper.permissions;

import cn.gson.hui_ren_boot.model.pojos.permissions.UserInfo;
import org.apache.catalina.LifecycleState;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    //用户登录
    public UserInfo allUser(UserInfo userInfo);

    //新增用户
    public void addUser(UserInfo userInfo);

    //修改用户
    public void updateUser(UserInfo userInfo);

    //调拨申请查找用户
    public List<UserInfo> seUser(UserInfo userInfo);
}
