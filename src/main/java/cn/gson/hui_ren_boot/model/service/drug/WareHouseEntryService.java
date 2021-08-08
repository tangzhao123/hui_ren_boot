package cn.gson.hui_ren_boot.model.service.drug;

import cn.gson.hui_ren_boot.model.mapper.drug.*;
import cn.gson.hui_ren_boot.model.pojos.pharmacy.DrugStock;
import cn.gson.hui_ren_boot.model.pojos.pharmacy.EntryDetails;
import cn.gson.hui_ren_boot.model.pojos.pharmacy.WarehouseEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class WareHouseEntryService {

    @Autowired
    WareHouseEntryMapper wareHouseEntryMapper;

    @Autowired
    DrugStockMapper drugStockMapper;

    @Autowired
    EntryDetailsMapper entryDetailsMapper;

    @Autowired
    ThroughMapper throughMapper;

    @Autowired
    DrugDeportMapper drugDeportMapper;



    //新增入库单跟入库详单还有库存表
    public void addEntryDetails(WarehouseEntry warehouseEntry, List<EntryDetails> entryDetailsData, List<DrugStock> drugStocks){
        wareHouseEntryMapper.addWareHouseEntry(warehouseEntry);
        entryDetailsMapper.addEntryDetails(entryDetailsData,warehouseEntry.getEntrySerial());
        drugStockMapper.addDrugStock(drugStocks);
        throughMapper.addThrough(warehouseEntry.getEntryPharmacy(),warehouseEntry.getEntrySerial());
        int sum = 0;
        for (EntryDetails e : entryDetailsData) {
            sum += e.getDetailNumber().intValue();
        }
        drugDeportMapper.updateDeport(sum,warehouseEntry.getEntryPharmacy());
    }
}
