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
    public Object allSupplierByPage(Integer pageNo, Integer size,DrugSupplier drugSupplier){
        return drugSupplierMapper.allSupplier(drugSupplier);
    }

    public List<DrugSupplier> findAllSupplier(){
        return drugSupplierMapper.findAllSupplier();
    }
    public List<DrugSupplier> allSuppt(DrugSupplier drugSupplier){
        return drugSupplierMapper.allSuppt(drugSupplier);
    }
    public void addSupplier(DrugSupplier drugSupplier){
        drugSupplierMapper.addSupplier(drugSupplier);
    }
    public void upSupplier(DrugSupplier drugSupplier){
        drugSupplierMapper.upSupplier(drugSupplier);
    }
    public void deSupplier(int supplierId){
        drugSupplierMapper.deSupplier(supplierId);
    }
}
