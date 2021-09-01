package cn.gson.hui_ren_boot.controller.drug;


import cn.gson.hui_ren_boot.model.pojos.pharmacy.Deduct;
import cn.gson.hui_ren_boot.model.pojos.pharmacy.GoBank;

import cn.gson.hui_ren_boot.model.service.drug.DeductService;
import cn.gson.hui_ren_boot.model.service.drug.GoBankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/Drug")
public class GoBankController {

    @Autowired
    GoBankService goBankService;

    @Autowired
    DeductService deductService;

    //新增出库单跟出库详单
    @RequestMapping("add-goBank")
    public List<Deduct> addGoBank(@RequestBody GoBank goBank){
            goBankService.addGoBank(goBank, goBank.getStorageData());
            //根据出库单号查询库存扣除记录
            List<Deduct> allDeduct = deductService.findAllDeduct(goBank.getGoNum());
            return allDeduct;
    }
}
