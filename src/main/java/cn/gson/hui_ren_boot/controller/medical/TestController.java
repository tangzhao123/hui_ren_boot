package cn.gson.hui_ren_boot.controller.medical;

import cn.gson.hui_ren_boot.model.pojos.medical.Cmobo;
import cn.gson.hui_ren_boot.model.pojos.medical.Comboitem;
import cn.gson.hui_ren_boot.model.pojos.medical.Test;
import cn.gson.hui_ren_boot.model.pojos.medical.Testmiddle;
import cn.gson.hui_ren_boot.model.service.medical.CmoboSerivice;
import cn.gson.hui_ren_boot.model.service.medical.ComboitemService;
import cn.gson.hui_ren_boot.model.service.medical.TestService;
import cn.gson.hui_ren_boot.utils.MyUtil;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class TestController {
    @Autowired
    TestService testService;

    @Autowired
    CmoboSerivice cmoboSerivice;//套餐


    //预约体检的信息
    @RequestMapping("/test-update")
    public String updateTest(@RequestBody Map<String,Object> map){
        System.out.println("==============open===========");
        ObjectMapper mapper = new ObjectMapper();
        Test t = mapper.convertValue(map.get("test"),Test.class);//体检人表
        String account = MyUtil.genrateNo("TJDH");
        t.setTestAccount(account);//体检单号
        testService.insertTest(t);
        //选择的单个项目
        List<Object> list = (List<Object>) map.get("middle");
        testService.allItem(list,t.getTestAccount());
        //选择的套餐
        List<Object> list1 = (List<Object>) map.get("tao");
        testService.allCmob(list1,t.getTestAccount());
        return "ok";
    }

    //删除
    @RequestMapping("/test-del")
    public String testDel(String id){
        testService.dels(id);
        return "ok";
    }

    //查询预约体检
    @GetMapping("/test-list")
    public Object testAll(int pageNo,int size,String testName){
        Test t = JSONObject.parseObject(testName,Test.class);
        return testService.selectCmoboByPage(pageNo,size,t);
    }

}
