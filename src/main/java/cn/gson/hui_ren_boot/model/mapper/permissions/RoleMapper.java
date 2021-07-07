package cn.gson.hui_ren_boot.model.mapper.permissions;

import cn.gson.hui_ren_boot.model.pojos.permissions.Function;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RoleMapper {

    //查询菜单栏
    public List<Function> userRole(Long userId);

    //查询父级权限
    public List<Function> allFuns();

    //查询子级权限
    public List<Function> childrenFuns(Long authityLeadaers);

    //查询角色已经有用的权限
    public List<Integer> roleFuns(Long roleinfoId);
}
