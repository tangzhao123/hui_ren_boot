package cn.gson.hui_ren_boot.controller.medical;

import cn.gson.hui_ren_boot.model.pojos.medical.TestResult;
import cn.gson.hui_ren_boot.model.pojos.outpatient.TestDetail;
import cn.gson.hui_ren_boot.model.pojos.outpatient.TestItems;
import cn.gson.hui_ren_boot.model.service.medical.TestItemsService;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestItemsController {
    @Autowired
    TestItemsService itemsService;

    //检查结果
    @RequestMapping("/result-add")
    public String addresult(@RequestBody TestResult retuslt){
        try {
            TestResult result1 = retuslt;
            itemsService.addresult(result1);
            System.out.println("dh结果："+retuslt.toString());
            return "ok";
        }catch (Exception e) {
            e.printStackTrace();
            return "fail";
        }
    }

    //查询检验的项目，根据检验号
    @GetMapping("/details-sel")
    public List<TestDetail> seldeetails(String testNumber){
        return itemsService.selitems(testNumber);
    }

    //查询要检验的
    @GetMapping("/items-select")
    public Object selitems(int pageNo,int size,String items){
        TestItems items1 = JSONObject.parseObject(items,TestItems.class);
        return itemsService.selitemByPage(pageNo,size,items1);
    }
}
