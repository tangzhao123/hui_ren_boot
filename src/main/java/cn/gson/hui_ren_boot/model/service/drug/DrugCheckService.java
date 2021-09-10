package cn.gson.hui_ren_boot.model.service.drug;

import cn.gson.hui_ren_boot.model.mapper.drug.DrugCheckMapper;
import cn.gson.hui_ren_boot.model.mapper.drug.InventoryMapper;
import cn.gson.hui_ren_boot.model.pojos.pharmacy.DrugCheck;
import cn.gson.hui_ren_boot.model.pojos.pharmacy.Inventory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DrugCheckService {

    @Autowired
    DrugCheckMapper drugCheckMapper;

    @Autowired
    InventoryMapper inventoryMapper;

    //新增盘点表跟盘点详情表
    public void addDrugCheck(DrugCheck drugCheck){
        drugCheckMapper.addDrugCheck(drugCheck);
        inventoryMapper.addInventory(drugCheck.getInventoryData(),drugCheck.getCheckNo());
    }


    //查询所有未审批的盘点单
    public Object findAllDrugCheckByPage(Integer pageNo,Integer size){
        return drugCheckMapper.findAllDrugCheck();
    }

    //查询所有已审批盘点单
    public Object allDrugCheckByPage(Integer pageNo,Integer size){
        return drugCheckMapper.allDrugCheck();
    }

    //根据盘点单号查询
    public List<Inventory> findAllInventory(String inventoryCheck){
        return inventoryMapper.findAllInventory(inventoryCheck);
    }

    //审批盘点单
    public void updateDrugCheck(Long checkAuditor, String checkNo){
        drugCheckMapper.updateDrugCheck(checkAuditor, checkNo);
    }

    //新增销毁申请单号
    public void updateCheckGo( String checkGo,String checkNo){
        drugCheckMapper.updateCheckGo(checkGo, checkNo);
    }
}