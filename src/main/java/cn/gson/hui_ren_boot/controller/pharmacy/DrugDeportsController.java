package cn.gson.hui_ren_boot.controller.pharmacy;

import cn.gson.hui_ren_boot.model.pojos.pharmacy.DrugDeport;
import cn.gson.hui_ren_boot.model.service.pharmacy.DrugDeportsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/Drugdeport")
public class DrugDeportsController {
    @Autowired
    DrugDeportsService drugDeportService;
    @RequestMapping("/deports")
    public List<DrugDeport> allDeport(DrugDeport deport){
       return drugDeportService.allDeport(deport);
    }
}
