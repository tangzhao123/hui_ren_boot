package cn.gson.hui_ren_boot.model.mapper.pharmacy;

import cn.gson.hui_ren_boot.model.pojos.pharmacy.PurchasePlan;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PurchasePlanMapper {
    public List<PurchasePlan> allPlan(@Param("purchaseId")String purchaseId,@Param("drugName")String drugName);
}
