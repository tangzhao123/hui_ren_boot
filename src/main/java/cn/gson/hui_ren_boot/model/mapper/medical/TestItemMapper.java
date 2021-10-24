package cn.gson.hui_ren_boot.model.mapper.medical;

import cn.gson.hui_ren_boot.model.pojos.medical.TestResult;
import cn.gson.hui_ren_boot.model.pojos.outpatient.TestDetail;
import cn.gson.hui_ren_boot.model.pojos.outpatient.TestItems;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TestItemMapper {
    //查看结果
    public List<TestResult> kanmen(@Param("resultNumber") String resultNumber);

    //添加结果
    public void addresult(TestResult result);

    //查询检验的项目，根据检验号
    public List<TestDetail> selitems(String testNumber);

//    查询要检验的项目
    public List<TestItems> selitem(TestItems items);
}
