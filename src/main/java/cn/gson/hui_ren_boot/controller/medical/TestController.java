package cn.gson.hui_ren_boot.controller.medical;

import cn.gson.hui_ren_boot.model.pojos.hospital.InspectDebit;
import cn.gson.hui_ren_boot.model.pojos.medical.*;
import cn.gson.hui_ren_boot.model.service.medical.CmoboSerivice;
import cn.gson.hui_ren_boot.model.service.medical.ComboitemService;
import cn.gson.hui_ren_boot.model.service.medical.TestService;
import cn.gson.hui_ren_boot.model.service.medical.ZhuYuanService;
import cn.gson.hui_ren_boot.utils.MyUtil;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class TestController {
    @Autowired
    TestService testService;

    @Autowired
    CmoboSerivice cmoboSerivice;//套餐
    @Autowired
    ZhuYuanService service;

    //查看检验结果
    @GetMapping("/look-all")
    public List<Combinspection> lookresult(String inspectionPhone){
        System.out.println("电话号码"+inspectionPhone);
        System.out.println("jie过"+testService.lookresult(inspectionPhone));
        return testService.lookresult(inspectionPhone);
    }

    //新增检验结果
    @RequestMapping("/pay-spection")
    public String zyspection(@RequestBody Combinspection combinspection){
        try {
            Combinspection cc = combinspection;
            System.out.println("结果"+cc.getTestId());
            service.zyspection(cc);//新增体检结果
            testService.payitem(cc.getTestId());//修改体检的状态
            return "ok";
        }catch (Exception e){
            e.printStackTrace();
            return "fail";
        }
    }

    //缴费
    @PostMapping("/add-debit")
    public String addDebit(@RequestBody InspectDebit debit){
        try{
            System.out.println("缴费记录："+debit);
            testService.addDebit(debit);
            return "ok";
        }catch (Exception e){
            e.printStackTrace();
            return "fail";
        }
    }


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
        System.out.println("查询条件："+testName);
        Test t = JSONObject.parseObject(testName,Test.class);
        return testService.selectCmoboByPage(pageNo,size,t);
    }

}
