package cn.gson.hui_ren_boot.controller.pharmacy;

import cn.gson.hui_ren_boot.model.pojos.pharmacy.DrugSupplier;
import cn.gson.hui_ren_boot.model.service.pharmacy.DrugSupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/DrugSupplier")
public class DrugSupplierController {
    @Autowired
    DrugSupplierService drugSupplierService;
    //查规格表
    @RequestMapping("/supplier")
    public List<DrugSupplier> allSupplier(){
       return drugSupplierService.allSupplier();
    }
}
