package cn.gson.hui_ren_boot.model.mapper.drug;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ThroughMapper {
    //新增仓库明细
    public void addThrough(@Param("throughDeport") Long throughDeport,@Param("throughEntry") String throughEntry);
}
