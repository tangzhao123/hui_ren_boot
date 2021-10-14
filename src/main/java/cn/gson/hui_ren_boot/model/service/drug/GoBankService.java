package cn.gson.hui_ren_boot.model.service.drug;

import cn.gson.hui_ren_boot.model.mapper.drug.*;
import cn.gson.hui_ren_boot.model.pojos.pharmacy.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
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

    @Autowired
    PharmacyDetailMapper pharmacyDetailMapper;

    @Autowired
    DeductService deductService;

    @Autowired
    DisposeApplyService disposeApplyService;

    //新增出库单跟出库详单
    public void addGoBank(GoBank goBank, List<Stockout> storageData ){
        goBankMapper.addGoBank(goBank);//新增出库单
        stockOutMapper.addStockOut(storageData,goBank.getGoNum());//新增出库详单
        if(goBank.getTransfersId()!=null){
            transfers1Mapper.updateTransfers(goBank.getGoDate(),goBank.getGoNum(),goBank.getTransfersId());//新增调拨单的出库时间，出库仓库，出库单号
        }
        if(goBank.getApplyNum()!=null){
            disposeApplyService.updateApply(goBank.getGoDate(),goBank.getGoNum(),goBank.getApplyNum());////新增销毁单的出库单号跟出库时间
        }
        List<Stockout> stockouts = goBank.getStorageData();//出库详情的集合
        for (Stockout s : stockouts) {
            List<DrugStock> drugStocks = drugStockMapper.findAllStock(s.getStockoutProduct());//根据药品编号查询剩余库存
            Long xuqiu = s.getStockoutAmount();//出库的数量
            for (DrugStock kc : drugStocks) {
                List<PharmacyDetail> pharmacyDetails = pharmacyDetailMapper.findPharmacyDetail(kc.getStockBatch());//药房药品库存详情
                if(xuqiu>0){
                    if(kc.getStockSurplus()>=xuqiu){
                        //根据批次去扣除库存数量
                       drugStockMapper.updateDrugStock(xuqiu,kc.getStockBatch());
                        //根据仓库编号减去仓库的总库存
                        drugDeportMapper.updateDeports(xuqiu.intValue(),goBank.getGoWarehouse());
                        //新增库存扣除记录表
                        Deduct deduct  = new Deduct(s.getStockoutProduct(),kc.getStockBatch(),xuqiu,goBank.getGoNum());
                        if(deduct.getDeductSum()>0){
                           deductService.addDeduct(deduct);
                        }

                        if(!goBank.getGoNum().substring(0,4).equals("XHCK")){
                            PharmacyDetail pd  = new PharmacyDetail(goBank.getGoWarehouse(),s.getStockoutProduct().toString(),xuqiu,kc.getStockBatch(),kc.getStockDate());

                           if(pharmacyDetails.isEmpty()){
                               //新增药房药品库存
                               pharmacyDetailMapper.addPharmacyDetail(pd);
                           }else{
                               //根据药品编号修改药房的库存
                               pharmacyDetailMapper.updatePharmacyDetail(xuqiu,kc.getStockBatch());
                           }

                            }

                        }
                        xuqiu = kc.getStockSurplus()-xuqiu;

                        break;
                    }else{
                        //根据批次扣除数量
                        drugStockMapper.updateDrugStock(kc.getStockSurplus(),kc.getStockBatch());
                        //根据仓库编号减去仓库的总库存
                       drugDeportMapper.updateDeports(kc.getStockSurplus().intValue(),goBank.getGoWarehouse());
                        //新增库存扣除记录表
                        Deduct deduct  = new Deduct(s.getStockoutProduct(),kc.getStockBatch(),kc.getStockSurplus(),goBank.getGoNum());
                        if(deduct.getDeductSum()>0){
                          deductService.addDeduct(deduct);
                        }
                        if(!goBank.getGoNum().substring(0,4).equals("XHCK")){
                           if(kc.getStockSurplus()>0){
                               PharmacyDetail pd  = new PharmacyDetail(goBank.getGoWarehouse(),s.getStockoutProduct().toString(),xuqiu,kc.getStockBatch(),kc.getStockDate());
                               if(pharmacyDetails.isEmpty()){
                                   //新增药房药品库存
                                   pharmacyDetailMapper.addPharmacyDetail(pd);
                               }else{
                                   //根据药品编号修改药房的库存
                                   pharmacyDetailMapper.updatePharmacyDetail(xuqiu,kc.getStockBatch());
                               }
                           }
                        }
                        xuqiu = xuqiu-kc.getStockSurplus();
                    }
                }
            }
        }

    //查询历史出库记录
    public List<GoBank> findAllGoBank(String start,String end,String search){
        return goBankMapper.findAllGoBank(start, end, search);
    }


    //根据出库单号查询出库详单
    public List<Stockout> findAllStockOut(String stockoutGo){
        return stockOutMapper.findAllStockOut(stockoutGo);
    }
}
