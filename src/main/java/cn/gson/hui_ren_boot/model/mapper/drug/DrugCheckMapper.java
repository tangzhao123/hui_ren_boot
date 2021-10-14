package cn.gson.hui_ren_boot.model.mapper.drug;

import cn.gson.hui_ren_boot.model.pojos.pharmacy.DrugCheck;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DrugCheckMapper {

    //新增盘点表
    public void addDrugCheck(DrugCheck drugCheck);

    //查询所有未审批的盘点单
    public List<DrugCheck> findAllDrugCheck();

    //查询所有已审批盘点单
    public List<DrugCheck> allDrugCheck();

    //审批盘点单
    public void updateDrugCheck(String checkNo);

    //驳回盘点单
    public void updateDrugCheck1(String checkNo);

    //驳回盘点单
    public void updateDrugCheck2(String checkNo);

    //新增销毁申请单号
    public void updateCheckGo(@Param("checkGo") String checkGo,@Param("checkNo") String checkNo);
}
