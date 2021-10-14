package cn.gson.hui_ren_boot.model.mapper.medical;

import cn.gson.hui_ren_boot.model.pojos.medical.Test;
import cn.gson.hui_ren_boot.model.pojos.medical.Testmiddle;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestMapper {

    //删除
    public void dels (Long testId);

    //新增体检人员
    public void insertTest(Test test);

    //查询体检套餐（表格内）
    public List<Test> selectCmobo(Test test);

    //新增体检中间表
    public void addMiddle(Testmiddle testmiddle);
}
