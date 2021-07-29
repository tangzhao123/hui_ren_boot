package cn.gson.hui_ren_boot.controller.drug;

import cn.gson.hui_ren_boot.model.pojos.pharmacy.DrugDeport;
import cn.gson.hui_ren_boot.model.pojos.pharmacy.EntryDetails;
import cn.gson.hui_ren_boot.model.pojos.pharmacy.OrderDetails;
import cn.gson.hui_ren_boot.model.pojos.pharmacy.WarehouseEntry;
import cn.gson.hui_ren_boot.model.service.drug.DrugDeportService;
import cn.gson.hui_ren_boot.model.service.drug.PurchaseOrderService;
import cn.gson.hui_ren_boot.model.service.drug.WareHouseEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/Drug")
public class WarehouseEntryController {

    @Autowired
    DrugDeportService drugDeportService;

    @Autowired
    WareHouseEntryService wareHouseEntryService;

    @Autowired
    PurchaseOrderService purchaseOrderService;

    //查询所有的仓库
    @RequestMapping("deport-list")
    public List<DrugDeport> findAllDeport(){
        return drugDeportService.finAllDeport();
    }

    //新增入库单跟入库详单，库存表
    @RequestMapping("addWareHouseEntry")
    public String addWareHouseEntry(@RequestBody WarehouseEntry warehouseEntry){
        try {
            wareHouseEntryService.addEntryDetails(warehouseEntry,warehouseEntry.getEntryDetailsData(),warehouseEntry.getDrugStocks());
            purchaseOrderService.updatePurchaseOrder(warehouseEntry.getEntryOrder());
            return "ok";
        } catch (Exception e) {
            e.printStackTrace();
            return "fail";
        }

    }
}
