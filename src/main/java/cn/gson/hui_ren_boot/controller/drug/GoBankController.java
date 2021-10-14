package cn.gson.hui_ren_boot.controller.drug;


import cn.gson.hui_ren_boot.model.pojos.pharmacy.Deduct;
import cn.gson.hui_ren_boot.model.pojos.pharmacy.GoBank;

import cn.gson.hui_ren_boot.model.pojos.pharmacy.Stockout;
import cn.gson.hui_ren_boot.model.service.drug.DeductService;
import cn.gson.hui_ren_boot.model.service.drug.GoBankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
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

    //查询历史出库记录
    @RequestMapping("go-bank-list")
    public List<GoBank> findAllGoBank(@RequestBody GoBank goBank){
        String start = null;
        String end = null;
        if (goBank.getStr() != null && goBank.getStr1() != null) {
            SimpleDateFormat sf = new SimpleDateFormat("yyy-MM-dd");
            start = sf.format(goBank.getStr());
            end = sf.format(goBank.getStr1());
        }
        List<GoBank> allGoBank = goBankService.findAllGoBank(start, end, goBank.getSearch());
        return allGoBank;
    }

    //根据出库单号查询出库详单
    @RequestMapping("stockOut-list")
    public List<Stockout> findAllStockOut(String stockoutGo){
        return goBankService.findAllStockOut(stockoutGo);
    }
}
