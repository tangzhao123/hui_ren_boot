package cn.gson.hui_ren_boot.model.mapper.permissions;

import cn.gson.hui_ren_boot.model.pojos.permissions.Roleinfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RoleInfoMapper {
    //查询所有角色
    public List<Roleinfo> allRole(String roleinfoName);

//    //查询父级角色
//    public List<Roleinfo> allRole();
//
//    //查询子级角色
//    public List<Roleinfo> childrenRole(Long roleinfoId);
}
