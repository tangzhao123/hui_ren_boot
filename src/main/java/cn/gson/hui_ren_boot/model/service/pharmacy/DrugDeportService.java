package cn.gson.hui_ren_boot.model.service.pharmacy;

import cn.gson.hui_ren_boot.model.mapper.pharmacy.DrugDeportMapper;
import cn.gson.hui_ren_boot.model.mapper.pharmacy.DrugSupplierMapper;
import cn.gson.hui_ren_boot.model.pojos.pharmacy.DrugDeport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DrugDeportService {
    @Autowired
    DrugDeportMapper drugDeportMapper;
    public List<DrugDeport> allDeport(DrugDeport deport){
        return drugDeportMapper.allDeport(deport);
    }
}
