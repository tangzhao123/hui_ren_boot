package cn.gson.hui_ren_boot.controller.medical;

import cn.gson.hui_ren_boot.model.pojos.medical.Comboitem;
import cn.gson.hui_ren_boot.model.service.medical.ComboitemService;
import cn.gson.hui_ren_boot.utils.MyUtil;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class ComboitemController {
    @Autowired
    ComboitemService comboitemService;

    //查询所有体检项目
    @GetMapping("/comboitem-list")
    public Object selectAll(int pageNo, int size, String addComboitem){

       Comboitem item = JSONObject.parseObject(addComboitem,Comboitem.class);//转换实体类

//        Map<String,Object> map = comboitemService.selectAll(pageNo,size,item);
//        //System.out.println(map.get("total"));
//        System.out.println(map);
        return comboitemService.selectAllByPage(pageNo,size,item);
    }

    @RequestMapping("/comboitem-add")
    public String addComboitem(@RequestBody Comboitem comboitem){
//        System.out.println(comboitem.getItemId());
        Comboitem c = comboitem;
        String number = MyUtil.genrateNo("XM");
        c.setItemNumber(number);
        if (comboitem.getItemId() == 0){
            comboitemService.addComboitem(c); //新增体检项目
        }else {
            comboitemService.updateComboitem(c);//修改体检项目
        }
        return "ok";
    }

    //删除体检项目
    @RequestMapping("/comboitem-del")
    public String delComboitem(Long id){
//        System.out.println(id);
        comboitemService.delComboitem(id);
        return "ok";
    }
}
