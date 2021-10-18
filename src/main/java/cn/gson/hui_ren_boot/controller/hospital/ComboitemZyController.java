package cn.gson.hui_ren_boot.controller.hospital;

import cn.gson.hui_ren_boot.model.pojos.medical.Comboitem;
import cn.gson.hui_ren_boot.model.service.hospital.ComboitemZyService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ComboitemZys")
public class ComboitemZyController {
    @Autowired
    ComboitemZyService comboitemZyService;
    @RequestMapping("allComboitems")
    public Object allComboitemByl(Integer pageNo, Integer size,String shu){
        Comboitem inputboxs = JSONObject.toJavaObject(JSON.parseObject(shu), Comboitem.class);
        return comboitemZyService.allComboitemByPage(pageNo,size,inputboxs);
    }
}
