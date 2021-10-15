package cn.gson.hui_ren_boot.model.mapper.outpatient;

import cn.gson.hui_ren_boot.model.pojos.medical.TestResult;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestResultMapper {
    //门诊查询检验结果
    public List<TestResult> selTestResult(String recordsNo);
}
