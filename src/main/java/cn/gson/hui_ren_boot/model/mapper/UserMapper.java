package cn.gson.hui_ren_boot.model.mapper;

import cn.gson.hui_ren_boot.model.pojos.UserInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    //用户登录
    public UserInfo allUser(UserInfo userInfo);
}
