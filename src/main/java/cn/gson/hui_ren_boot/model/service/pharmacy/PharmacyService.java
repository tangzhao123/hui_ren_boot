package cn.gson.hui_ren_boot.model.service.pharmacy;

import cn.gson.hui_ren_boot.model.mapper.pharmacy.PharmacyMapper;
import cn.gson.hui_ren_boot.model.pojos.pharmacy.Pharmacy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PharmacyService {

    @Autowired
    PharmacyMapper pharmacyMapper;
    public List<Pharmacy> allPharmacy(Pharmacy pharmacy){
        return pharmacyMapper.allPharmacy(pharmacy);
    }
}
