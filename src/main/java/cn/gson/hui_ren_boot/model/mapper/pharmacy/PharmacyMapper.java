package cn.gson.hui_ren_boot.model.mapper.pharmacy;

import cn.gson.hui_ren_boot.model.pojos.pharmacy.Pharmacy;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PharmacyMapper {
    public List<Pharmacy> allPharmacy(Pharmacy pharmacy);
}
