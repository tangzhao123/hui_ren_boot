package cn.gson.hui_ren_boot.model.service.drug;

import cn.gson.hui_ren_boot.model.mapper.drug.DrugConsumableMapper;
import cn.gson.hui_ren_boot.model.pojos.pharmacy.DrugConsumable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DrugConsumableService {

    @Autowired
    DrugConsumableMapper drugConsumableMapper;

    //查询所有的耗材信息
    public Object findAllConsumableByPage(Integer pageNo,Integer size){
        return drugConsumableMapper.findAllConsumable();
    }
}
