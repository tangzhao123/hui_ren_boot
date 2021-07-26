package cn.gson.hui_ren_boot.controller.pharmacy;

import cn.gson.hui_ren_boot.model.pojos.pharmacy.DrugSupplier;
import cn.gson.hui_ren_boot.model.service.pharmacy.DrugSupplierService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/DrugSupplier")
public class DrugSupplierController {
    @Autowired
    DrugSupplierService drugSupplierService;
    //分页查规格表
    @RequestMapping("/supplier")
    public Object allSupplier(Integer pageNo,Integer size,String drugSupplier){
       System.out.println(drugSupplier);
       DrugSupplier drugSuppliers = JSONObject.toJavaObject(JSON.parseObject(drugSupplier),DrugSupplier.class);
       System.out.println(drugSuppliers);
       return drugSupplierService.allSupplierByPage(pageNo,size,drugSuppliers);
    }
    @RequestMapping("/suppt")
    public List<DrugSupplier> allSuppt(DrugSupplier drugSupplier){
        return drugSupplierService.allSuppt(drugSupplier);
    }
}
