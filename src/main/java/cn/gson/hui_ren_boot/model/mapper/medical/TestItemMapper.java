package cn.gson.hui_ren_boot.model.mapper.medical;

import cn.gson.hui_ren_boot.model.pojos.outpatient.TestItems;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestItemMapper {
//    查询要检验的项目
    public List<TestItems> selitem(TestItems items);
}
