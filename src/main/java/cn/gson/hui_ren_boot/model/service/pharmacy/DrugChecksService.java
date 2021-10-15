package cn.gson.hui_ren_boot.model.service.pharmacy;

import cn.gson.hui_ren_boot.model.mapper.drug.DrugCheckMapper;
import cn.gson.hui_ren_boot.model.mapper.pharmacy.DrugChecksMapper;
import cn.gson.hui_ren_boot.model.pojos.pharmacy.DrugCheck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class DrugChecksService {

    @Autowired
    DrugChecksMapper drugChecksMapper;
    public Object checkByPage(Integer pageNo, Integer size,String checkNo,String drugName){
        return drugChecksMapper.check(checkNo, drugName);
    }
}
