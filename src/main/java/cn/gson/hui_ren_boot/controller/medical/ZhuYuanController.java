package cn.gson.hui_ren_boot.controller.medical;

import cn.gson.hui_ren_boot.model.pojos.medical.Test;
import cn.gson.hui_ren_boot.model.service.medical.ZhuYuanService;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZhuYuanController {
    @Autowired
    ZhuYuanService service;

    @GetMapping("/zy-select")
    public Object zycomo(int pageNo, int size,String zhus){
        Test test = JSONObject.parseObject(zhus,Test.class);
        System.out.println("欢呼声"+zhus);
        return service.zycomoByPage(pageNo,size,test);
    }
}
