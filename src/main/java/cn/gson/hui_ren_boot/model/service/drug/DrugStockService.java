package cn.gson.hui_ren_boot.model.service.drug;

import cn.gson.hui_ren_boot.model.mapper.drug.DrugStockMapper;
import cn.gson.hui_ren_boot.model.mapper.drug.ScatteredMapper;
import cn.gson.hui_ren_boot.model.pojos.pharmacy.DrugStock;
import cn.gson.hui_ren_boot.model.pojos.pharmacy.Scattered;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class DrugStockService {

    @Autowired
    DrugStockMapper drugStockMapper;

    @Autowired
    ScatteredMapper scatteredMapper;


    //临期库存药品查询
    public Object findAllPeriodByPage(Integer pageNo,Integer size,List<String> stockBatch){
        return drugStockMapper.findAllPeriod(stockBatch);
    }

    //根据药品类别查询库存
    public List<DrugStock> allDrugStock(Long typeId){
        return drugStockMapper.allDrugStock(typeId);
    }

    //修改库存数量
    public void updateDrugStock1(Long stockSurplus,String stockBatch){
        drugStockMapper.updateDrugStock1(stockSurplus, stockBatch);
    }

    //查询所有药品库存
    public Object findAllDrugStockByPage(Integer pageNo,Integer size,String search,Long typeId){
        return drugStockMapper.findAllDrugStock(search, typeId);
    }

    //查询所有的药品拆零记录
    public Object allScatteredByPage(Integer pageNo,Integer size){
        return scatteredMapper.allScattered();
    }
}
