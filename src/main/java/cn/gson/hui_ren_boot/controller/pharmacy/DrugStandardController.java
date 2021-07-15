package cn.gson.hui_ren_boot.controller.pharmacy;

import cn.gson.hui_ren_boot.model.pojos.pharmacy.DrugStandard;
import cn.gson.hui_ren_boot.model.service.pharmacy.DrugStandardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/DrugStandard")
public class DrugStandardController {
    @Autowired
    DrugStandardService drugStandardService;
    @RequestMapping("/standard")
    public List<DrugStandard> allStandard(){
        return drugStandardService.allStandard();
    }
}
