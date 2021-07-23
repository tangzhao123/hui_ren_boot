package cn.gson.hui_ren_boot.model.mapper.drug;

import cn.gson.hui_ren_boot.model.pojos.pharmacy.PlanDetails;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PlanDetailsMapper {

    //批量新增采购计划详单
    public void addDetails(List<PlanDetails> planDetails,String purchaseId);

    //根据采购计划单号查询详单
    public List<PlanDetails> allDetails(String purchaseId);
}
