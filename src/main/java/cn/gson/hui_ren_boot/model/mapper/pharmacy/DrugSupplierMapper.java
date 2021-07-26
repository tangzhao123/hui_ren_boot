package cn.gson.hui_ren_boot.model.mapper.pharmacy;

import cn.gson.hui_ren_boot.model.pojos.pharmacy.DrugSupplier;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DrugSupplierMapper {
    //查询供应商信息
    public List<DrugSupplier> allSupplier(DrugSupplier drugSupplier);

    //查询所有供货商
    public List<DrugSupplier> findAllSupplier();

    //查询供应商信息（药品弹框）
    public List<DrugSupplier> allSuppt(DrugSupplier drugSupplier);
}
