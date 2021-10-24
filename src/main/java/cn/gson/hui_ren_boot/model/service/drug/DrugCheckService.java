package cn.gson.hui_ren_boot.model.service.drug;

import cn.gson.hui_ren_boot.model.mapper.drug.CorrectionMapper;
import cn.gson.hui_ren_boot.model.mapper.drug.DrugCheckMapper;
import cn.gson.hui_ren_boot.model.mapper.drug.InventoryMapper;
import cn.gson.hui_ren_boot.model.pojos.permissions.CheckInfo;
import cn.gson.hui_ren_boot.model.pojos.pharmacy.Correction;
import cn.gson.hui_ren_boot.model.pojos.pharmacy.DrugCheck;
import cn.gson.hui_ren_boot.model.pojos.pharmacy.Inventory;
import cn.gson.hui_ren_boot.model.service.permissions.CheckInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class DrugCheckService {

    @Autowired
    DrugCheckMapper drugCheckMapper;

    @Autowired
    InventoryMapper inventoryMapper;

    @Autowired
    CheckInfoService checkInfoService;

    @Autowired
    CorrectionMapper correctionMapper;

    //新增盘点表跟盘点详情表
    public void addDrugCheck(DrugCheck drugCheck){
        drugCheckMapper.addDrugCheck(drugCheck);
        inventoryMapper.addInventory(drugCheck.getInventoryData(),drugCheck.getCheckNo());
        List<Correction> corrections = new ArrayList<>();
        drugCheck.getInventoryData().forEach(d->{
            if(d.getInventoryKnum()!=0){
                corrections.add(new Correction(d.getInventoryDrug(),d.getInventoryBatch(),d.getInventorySum().intValue(),d.getInventoryKnum().intValue(),(d.getInventorySum().intValue()-Math.abs(d.getInventoryKnum().intValue()))));
            }
        });
        corrections.forEach(c->{
            correctionMapper.addCorrection(c);
        });
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
    public void updateDrugCheck(CheckInfo checkInfo){
        checkInfoService.addCheckInfo(checkInfo);
        drugCheckMapper.updateDrugCheck(checkInfo.getCheckNo());
    }

    //驳回盘点单
    public void updateDrugCheck1(CheckInfo checkInfo){
        checkInfoService.addCheckInfo(checkInfo);
        drugCheckMapper.updateDrugCheck1(checkInfo.getCheckNo());
    }

    //新增销毁申请单号
    public void updateCheckGo( String checkGo,String checkNo){
        drugCheckMapper.updateCheckGo(checkGo, checkNo);
    }
}
