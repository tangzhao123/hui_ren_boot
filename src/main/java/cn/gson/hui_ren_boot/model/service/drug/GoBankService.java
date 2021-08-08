package cn.gson.hui_ren_boot.model.service.drug;

import cn.gson.hui_ren_boot.model.mapper.drug.*;
import cn.gson.hui_ren_boot.model.pojos.pharmacy.DrugStock;
import cn.gson.hui_ren_boot.model.pojos.pharmacy.GoBank;
import cn.gson.hui_ren_boot.model.pojos.pharmacy.Stockout;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class GoBankService {

    @Autowired
    DrugStockMapper drugStockMapper;

    @Autowired
    GoBankMapper goBankMapper;

    @Autowired
    StockOutMapper stockOutMapper;

    @Autowired
    DrugDeportMapper drugDeportMapper;

    @Autowired
    Transfers1Mapper transfers1Mapper;


    //新增出库单跟出库详单
    public void addGoBank(GoBank goBank, List<Stockout> storageData ){
        goBankMapper.addGoBank(goBank);//新增出库单
        stockOutMapper.addStockOut(storageData,goBank.getGoNum());//新增出库详单
        transfers1Mapper.updateTransfers(goBank.getGoDate(),goBank.getGoWarehouse(),goBank.getGoNum());//新增调拨单的出库时间，出库仓库，出库单号
        List<Stockout> stockouts = goBank.getStorageData();//出库详情的集合
        for (Stockout s : stockouts) {
            List<DrugStock> drugStocks = drugStockMapper.findAllStock(s.getStockoutProduct());//根据药品编号查询剩余库存
            Long xuqiu = s.getStockoutAmount();//出库的数量
            for (DrugStock kc : drugStocks) {
                if(xuqiu>0){
                    if(kc.getStockSurplus()>=xuqiu){
                        //根据批次去扣除库存数量
                        drugStockMapper.updateDrugStock(xuqiu,kc.getStockBatch());
                        //根据仓库编号减去仓库的总库存
                        drugDeportMapper.updateDeports(xuqiu.intValue(),goBank.getGoWarehouse());
                        xuqiu = kc.getStockSurplus()-xuqiu;
                        break;
                    }else{
                        //根据批次扣除数量
                        drugStockMapper.updateDrugStock(kc.getStockSurplus(),kc.getStockBatch());
                        //根据仓库编号减去仓库的总库存
                        drugDeportMapper.updateDeports(kc.getStockSurplus().intValue(),goBank.getGoWarehouse());
                        xuqiu = xuqiu-kc.getStockSurplus();
                    }
                }
            }
        }
    }


}
