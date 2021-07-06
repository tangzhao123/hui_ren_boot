package cn.gson.hui_ren_boot.model.mapper.permissions;

import cn.gson.hui_ren_boot.model.pojos.permissions.Function;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RoleMapper {

    //查询菜单栏
    public List<Function> userRole(Long userId);


}
