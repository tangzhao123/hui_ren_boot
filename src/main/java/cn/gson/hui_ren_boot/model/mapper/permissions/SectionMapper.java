package cn.gson.hui_ren_boot.model.mapper.permissions;

import cn.gson.hui_ren_boot.model.pojos.permissions.Section;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SectionMapper {
    //查询所有的部门
    public List<Section> allSection();

//    //根据名称查询编号
    public int bySectionId(String sectionName);
}
