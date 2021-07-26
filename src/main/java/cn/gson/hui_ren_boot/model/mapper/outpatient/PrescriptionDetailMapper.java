package cn.gson.hui_ren_boot.model.mapper.outpatient;

import cn.gson.hui_ren_boot.model.pojos.outpatient.PrescriptionDetail;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 门诊处方详单
 */
@Mapper
public interface PrescriptionDetailMapper {

    //新增门诊西药处方详单
    public void addDetail(List<PrescriptionDetail> details,String prescriptionNo);
}
