package cn.gson.hui_ren_boot.model.mapper.medical;

import cn.gson.hui_ren_boot.model.pojos.medical.Test;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestMapper {
    //查询预约体检人员
    public List<Test> testAll(String testName);
}
