package cn.gson.hui_ren_boot.controller.drug;

import cn.gson.hui_ren_boot.model.pojos.pharmacy.DrugCheck;
import cn.gson.hui_ren_boot.model.pojos.pharmacy.Inventory;
import cn.gson.hui_ren_boot.model.service.drug.DrugCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/Drug")
public class DrugCheckController {

    @Autowired
    DrugCheckService drugCheckService;

    //新增盘点单跟盘点详单
    @RequestMapping("add-drug-check")
    public String addDrugCheck(@RequestBody DrugCheck drugCheck){

        try {
            if(drugCheck.getCheckKnum()>=0){
                drugCheck.setCheckType(0L);
            }else{
                drugCheck.setCheckType(1L);
            }
            drugCheckService.addDrugCheck(drugCheck);
            return "ok";
        } catch (Exception e) {
            e.printStackTrace();
            return "fail";
        }

    }

    //查询所有未审批的盘点单
    @RequestMapping("drug-check-list")
    public Object findAllDrugCheck(Integer pageNo,Integer size){
        return drugCheckService.findAllDrugCheckByPage(pageNo,size);
    }

    //查询所有已审批盘点单
    @RequestMapping("all-drug-check")
    public Object allDrugCheckByPage(Integer pageNo,Integer size){
        return drugCheckService.allDrugCheckByPage(pageNo, size);
    }

    //根据盘点单号查询
    @RequestMapping("inventory-list")
    public List<Inventory> findAllInventory(String inventoryCheck){
        return drugCheckService.findAllInventory(inventoryCheck);
    }

    //审批盘点单
    @RequestMapping("update-drugCheck")
    public String updateDrugCheck(Long checkAuditor,  String checkNo){
        try {
           drugCheckService.updateDrugCheck(checkAuditor, checkNo);
            return "ok";
        } catch (Exception e) {
            e.printStackTrace();
            return "fail";
        }
    }
}
