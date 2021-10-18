package cn.gson.hui_ren_boot.controller.medical;

import cn.gson.hui_ren_boot.model.pojos.medical.Combinspection;
import cn.gson.hui_ren_boot.model.pojos.medical.Comboitem;
import cn.gson.hui_ren_boot.model.pojos.medical.Test;
import cn.gson.hui_ren_boot.model.service.medical.ZhuYuanService;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ZhuYuanController {
    @Autowired
    ZhuYuanService service;

    //新增检验结果
    @RequestMapping("/zy-spection")
    public String zyspection(@RequestBody Combinspection combinspection){
        try {
            Combinspection cc = combinspection;
            System.out.println("结果"+cc.getTestId());
            service.zyspection(cc);//新增体检结果
            service.updateitem(cc.getTestId());//修改体检的状态
            return "ok";
        }catch (Exception e){
            e.printStackTrace();
            return "fail";
        }
    }

    //查询项目
    @GetMapping("/zy-xiangmu")
    public List<Comboitem> zyitem(String testAccount){
        return service.zyitem(testAccount);
    }

    @GetMapping("/zy-select")
    public Object zycomo(int pageNo, int size,String zhus){
        Test test = JSONObject.parseObject(zhus,Test.class);
        return service.zycomoByPage(pageNo,size,test);
    }
}
