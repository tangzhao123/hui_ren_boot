package cn.gson.hui_ren_boot.model.service.pharmacy;

import cn.gson.hui_ren_boot.model.mapper.pharmacy.DrugStandardMapper;
import cn.gson.hui_ren_boot.model.pojos.pharmacy.DrugStandard;
import cn.gson.hui_ren_boot.model.pojos.pharmacy.DrugType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DrugStandardService {
    @Autowired
    DrugStandardMapper drugStandardMapper;
    public List<DrugStandard> allStandard(){
        return drugStandardMapper.allStandard();
    }
}
