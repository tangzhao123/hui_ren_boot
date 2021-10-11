package cn.gson.hui_ren_boot.model.mapper.medical;

import cn.gson.hui_ren_boot.model.pojos.hospital.Additional;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AdditionalMapper {
//    修改手术项目
    public void updateitional(Additional additional);

//    新增手术项目
    public void additional(Additional additional);

//    查询手术项目
    public List<Additional> selectitonal(Additional additional);
}
