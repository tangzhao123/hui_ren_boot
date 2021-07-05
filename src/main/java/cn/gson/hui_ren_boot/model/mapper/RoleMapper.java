package cn.gson.hui_ren_boot.model.mapper;

import cn.gson.hui_ren_boot.model.pojos.Function;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RoleMapper {

    //查询菜单栏
    public List<Function> userRole(Long userId);

    //查询导航栏
    public List<Function> userMenu(Long roleinfoId);

    //根据用户查询角色编号
    public int user(Long userId);
}
