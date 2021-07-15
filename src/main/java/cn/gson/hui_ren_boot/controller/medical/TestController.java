package cn.gson.hui_ren_boot.controller.medical;

import cn.gson.hui_ren_boot.model.pojos.medical.Test;
import cn.gson.hui_ren_boot.model.service.medical.ComboitemService;
import cn.gson.hui_ren_boot.model.service.medical.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    TestService testService;

    //修改预约体检的信息
    @RequestMapping("/test-update")
    public String updateTest(@RequestBody Test test){
        testService.addTest(test);
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
        System.out.println(testService.testAllByPage(pageNo,size,testName));
        return testService.testAllByPage(pageNo,size,testName);
    }
}
