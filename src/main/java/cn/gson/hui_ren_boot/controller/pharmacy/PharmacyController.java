package cn.gson.hui_ren_boot.controller.pharmacy;

import cn.gson.hui_ren_boot.model.pojos.pharmacy.Pharmacy;
import cn.gson.hui_ren_boot.model.service.pharmacy.PharmacyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Pharmacy")
public class PharmacyController {
    @Autowired
    PharmacyService pharmacyService;
    @RequestMapping("/pharmacys")
    public List<Pharmacy> allPharmacy(Pharmacy pharmacy){
        return pharmacyService.allPharmacy(pharmacy);
    }

}
