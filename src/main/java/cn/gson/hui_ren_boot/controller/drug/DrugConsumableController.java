package cn.gson.hui_ren_boot.controller.drug;


import cn.gson.hui_ren_boot.model.service.drug.DrugConsumableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Drug")
public class DrugConsumableController {

    @Autowired
    DrugConsumableService drugConsumableService;

    //查询所有的耗材信息
    @RequestMapping("drugConsumable-list")
    public Object findAllConsumable(Integer pageNo,Integer size){
        return drugConsumableService.findAllConsumableByPage(pageNo, size);
    }
}
