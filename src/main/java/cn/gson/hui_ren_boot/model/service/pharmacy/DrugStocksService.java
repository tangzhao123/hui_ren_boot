package cn.gson.hui_ren_boot.model.service.pharmacy;

import cn.gson.hui_ren_boot.model.mapper.pharmacy.DrugStocksMapper;
import cn.gson.hui_ren_boot.model.pojos.pharmacy.DrugStock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class DrugStocksService {
    @Autowired
    DrugStocksMapper drugStocksMapper;
    public Object seStockByPage(Integer pageNo,Integer size, String drugName,String typeName,String stockBatch){
        return drugStocksMapper.seStock(drugName, typeName, stockBatch);
    }
}
