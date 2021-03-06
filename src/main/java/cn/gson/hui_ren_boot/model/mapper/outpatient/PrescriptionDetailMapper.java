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

    //新增门诊中药处方详单
    public void addChineseDetail(List<PrescriptionDetail> details,String prescriptionNo);

    //根据处方号查询处方详单
    public List<PrescriptionDetail> selNo(String prescriptionNo);

    //查询患者每次所开的处方
    public List<PrescriptionDetail> selMedicine(String recordsNo);
}
