package cn.gson.hui_ren_boot.model.service.pharmacy;

import cn.gson.hui_ren_boot.model.mapper.pharmacy.WarehousesMapper;
import cn.gson.hui_ren_boot.model.pojos.pharmacy.WarehouseEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class WarehousesService {
    @Autowired
    WarehousesMapper warehousesMapper;
    public Object huoseByPage(Integer pageNo,Integer size,String entrySerial,String entryBatch,String drugName){
        return warehousesMapper.house(entrySerial,entryBatch,drugName);
    }
}
