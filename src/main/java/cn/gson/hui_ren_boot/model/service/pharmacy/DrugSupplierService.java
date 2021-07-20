package cn.gson.hui_ren_boot.model.service.pharmacy;

import cn.gson.hui_ren_boot.model.mapper.pharmacy.DrugSupplierMapper;
import cn.gson.hui_ren_boot.model.pojos.pharmacy.DrugSupplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DrugSupplierService {
    @Autowired
    DrugSupplierMapper drugSupplierMapper;
    public List<DrugSupplier> allSupplier(){
        return drugSupplierMapper.allSupplier();
    }
}
