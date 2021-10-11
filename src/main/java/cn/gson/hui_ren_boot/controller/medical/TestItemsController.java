package cn.gson.hui_ren_boot.controller.medical;

import cn.gson.hui_ren_boot.model.pojos.outpatient.TestItems;
import cn.gson.hui_ren_boot.model.service.medical.TestItemsService;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestItemsController {
    @Autowired
    TestItemsService itemsService;

    @GetMapping("/items-select")
    public Object selitems(int pageNo,int size,String items){
        TestItems items1 = JSONObject.parseObject(items,TestItems.class);
        System.out.println("检验："+items);
        System.out.println("结果："+items);
        System.out.println("哈哈哈哈："+itemsService.selitemByPage(pageNo,size,items1));
        return itemsService.selitemByPage(pageNo,size,items1);
    }
}
