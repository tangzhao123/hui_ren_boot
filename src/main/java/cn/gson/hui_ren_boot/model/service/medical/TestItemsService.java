package cn.gson.hui_ren_boot.model.service.medical;

import cn.gson.hui_ren_boot.model.mapper.medical.TestItemMapper;
import cn.gson.hui_ren_boot.model.pojos.medical.TestResult;
import cn.gson.hui_ren_boot.model.pojos.outpatient.TestDetail;
import cn.gson.hui_ren_boot.model.pojos.outpatient.TestItems;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestItemsService {
    @Autowired
    TestItemMapper itemsMapper;

    //查看结果
    public List<TestResult> kanmen(String resultNumber){
        return itemsMapper.kanmen(resultNumber);
    }

    //检验结果
    public void addresult(TestResult result){
        itemsMapper.addresult(result);
    }

    //查询检验的项目，根据检验号
    public List<TestDetail> selitems(String testNumber){
        return itemsMapper.selitems(testNumber);
    }

    //查询要检验的项目
    public Object selitemByPage (int pageNo, int size, TestItems items){
        return itemsMapper.selitem(items);
    }
}
