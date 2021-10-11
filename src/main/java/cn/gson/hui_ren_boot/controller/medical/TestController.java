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


    //修改预约体检的信息
    @RequestMapping("/test-update")
    public String updateTest(@RequestBody Map<String,Object> map){
        System.out.println("==============open===========");
        ObjectMapper mapper = new ObjectMapper();
        Test t = mapper.convertValue(map.get("test"),Test.class);//体检人表
        String account = MyUtil.genrateNo("TJ");
        t.setTestAccount(account);
        if (t.getTestId() == 0){
            testService.addTest(t);
        }
        System.out.println("体检人信息"+t);
       // testService.insertTest(t);
        System.out.println("======="+t.getTestId());
        Testmiddle testmiddle = new Testmiddle();//体检中间表
        List<Object> list = (List<Object>) map.get("middle");//选择的单个项目
        if (list != null){
            for (Object i: list) {
                Comboitem c = mapper.convertValue(i,Comboitem.class);//选择的项目
                System.out.println("项目"+c.getItemId());
                testmiddle.setTestAccount(t.getTestAccount());
                testmiddle.setItemId(c.getItemId());
                testService.addMiddle(testmiddle);//新增中间表
            }
        }

        Testmiddle testmiddle1 = new Testmiddle();//套餐的
        List<Object> list1 = (List<Object>) map.get("tao");//选择的套餐
        if (list1 != null){
            for (Object o : list1) {
                Cmobo m = mapper.convertValue(o,Cmobo.class);//转化成套餐的类
                System.out.println("套餐："+m.getComboId());
                System.out.println("套餐信息："+m);
                List<Comboitem> comboitems = cmoboSerivice.selectAll(m.getComboSerial());//查询套餐包含的项目
                for(Comboitem c : comboitems){
                    testmiddle1.setItemId(t.getTestId());
                    System.out.println("套餐项目"+c.getItemId());
                    testmiddle1.setItemId(c.getItemId());
                    testService.addMiddle(testmiddle1);
                }
            }
        }
        //testService.addMiddle(testmiddle1);

//        if (test.getTestId() == 0){
//            testService.insertTest(test);
//        }else{
//            testService.addTest(test);
//        }
//        testService.addTest(test);
        return "ok";
    }

    //删除
    @RequestMapping("/test-del")
    public String testDel(Long id){
        testService.delTest(id);
        return "ok";
    }

    //查询预约体检
    @GetMapping("/test-list")
    public Object testAll(int pageNo,int size,String testName){
//        System.out.println("页码"+pageNo);
//        System.out.println("大小"+size);
//        System.out.println("名字"+testName);
//        System.out.println(testService.selectCmoboByPage(pageNo,size,testName));
        Test t = JSONObject.parseObject(testName,Test.class);
        return testService.selectCmoboByPage(pageNo,size,t);
    }

}
