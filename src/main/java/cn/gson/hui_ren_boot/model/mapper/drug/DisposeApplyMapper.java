package cn.gson.hui_ren_boot.model.mapper.drug;

import cn.gson.hui_ren_boot.model.pojos.pharmacy.DisposeApply;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Mapper
public interface DisposeApplyMapper {

    //新增销毁申请单
    public void addDisposeApply(DisposeApply disposeApply);

    //查询所有未审批的销毁申请
    public List<DisposeApply> findAllDisposeApply();

    //查询所有已经审批的销毁申请
    public List<DisposeApply> allDisposeApply();

    //新增出库单号跟出库时间
    public void updateApply(@Param("applyTime") Date applyTime, @Param("applyGo") String applyGo, @Param("applyNum") String applyNum);

    //审批销毁申请单
    public void updateDisposeApply(String applyNum);

    //驳回销毁申请单
    public void updateDisposeApply1(String applyNum);
}
