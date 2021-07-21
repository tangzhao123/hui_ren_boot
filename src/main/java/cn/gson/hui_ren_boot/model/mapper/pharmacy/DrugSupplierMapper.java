package cn.gson.hui_ren_boot.model.mapper.pharmacy;

import cn.gson.hui_ren_boot.model.pojos.pharmacy.DrugSupplier;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DrugSupplierMapper {
    //查询供应商信息
    public List<DrugSupplier> allSupplier();
}