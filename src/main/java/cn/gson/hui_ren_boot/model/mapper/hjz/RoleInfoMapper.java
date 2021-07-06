package cn.gson.hui_ren_boot.model.mapper.hjz;

import cn.gson.hui_ren_boot.model.pojos.hjz.Roleinfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RoleInfoMapper {
    //查询所有角色
    public List<Roleinfo> allRole(Roleinfo roleinfo);
}
