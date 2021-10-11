package cn.gson.hui_ren_boot.model.mapper.drug;

import cn.gson.hui_ren_boot.model.pojos.pharmacy.PharmacyDetail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PharmacyDetailMapper {

    //根据药品编号修改药房库存
    public void updatePharmacyDetail(@Param("count") Long count,@Param("detailBatch") String detailBatch);

    //批量新增药房库存表
    public void addPharmacyDetail(PharmacyDetail pharmacyDetail);

    //查询所有的药房药品库存
    public List<PharmacyDetail> findAllPharmacyDetail(String drugId);


    public List<PharmacyDetail> findPharmacyDetail(String detailBatch);
}
