package cn.gson.hui_ren_boot.model.service.pharmacy;

import cn.gson.hui_ren_boot.model.mapper.pharmacy.DruginfoMapper;
import cn.gson.hui_ren_boot.model.pojos.pharmacy.DrugInfo;
import cn.gson.hui_ren_boot.model.service.outpatient.OutRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DrugService {
    @Autowired
    DruginfoMapper drugMapper;

    //查询药品信息

    public Object allDrugByPage(Integer pageNo, Integer size,DrugInfo drugInfo){
        return drugMapper.allDrug(drugInfo);
    }
}
