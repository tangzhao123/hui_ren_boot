package cn.gson.hui_ren_boot.controller.pharmacy;

import cn.gson.hui_ren_boot.model.pojos.pharmacy.DrugType;
import cn.gson.hui_ren_boot.model.service.pharmacy.DrugTypeService;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/DrugType")
public class DrugtypeController {
    @Autowired
    DrugTypeService drugTypeService;
    //查询类别表
    @RequestMapping("/types")
    public List<DrugType> allType(){
        return drugTypeService.allType();
    }
}
