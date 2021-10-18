package cn.gson.hui_ren_boot.controller.pharmacy;

import cn.gson.hui_ren_boot.model.pojos.pharmacy.DrugStock;
import cn.gson.hui_ren_boot.model.service.pharmacy.DrugStocksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("drugStock")
public class DrugStocksController {
    @Autowired
    DrugStocksService drugStocksService;
    @RequestMapping("stock")
    public Object seStockByPage(@RequestBody DrugStock drugStock){
        return drugStocksService.seStockByPage(drugStock.getPageNo(),drugStock.getSize(),drugStock.getDrugName(),
                drugStock.getTypeName(),drugStock.getStockBatch());

    }
}
