package cn.gson.hui_ren_boot.controller.drug;


import cn.gson.hui_ren_boot.model.pojos.pharmacy.GoBank;

import cn.gson.hui_ren_boot.model.service.drug.GoBankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/Drug")
public class GoBankController {

    @Autowired
    GoBankService goBankService;

    //新增出库单跟出库详单
    @RequestMapping("add-goBank")
    public String addGoBank(@RequestBody GoBank goBank){
        try {
            goBankService.addGoBank(goBank, goBank.getStorageData());
            return "ok";
        } catch (Exception e) {
            e.printStackTrace();
            return "fail";
        }
    }
}
