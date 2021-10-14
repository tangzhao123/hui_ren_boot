package cn.gson.hui_ren_boot.controller.pharmacy;

import cn.gson.hui_ren_boot.model.pojos.pharmacy.WarehouseEntry;
import cn.gson.hui_ren_boot.model.service.pharmacy.WarehousesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("warehouse")
public class WarehousesController {
    @Autowired
    WarehousesService warehousesService;
    @RequestMapping("entry")
    public Object houseByPage(Integer pageNo,Integer size, WarehouseEntry warehouseEntry){
        return warehousesService.huoseByPage(pageNo,size,warehouseEntry);
    }
}
