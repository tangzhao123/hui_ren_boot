package cn.gson.hui_ren_boot.model.mapper.outpatient;

import cn.gson.hui_ren_boot.model.pojos.outpatient.PrescriptionList;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 门诊处方单
 */
@Mapper
public interface PrescriptionListMapper {

    //新增门诊西药处方单
    public void addList(PrescriptionList prescriptionList);

    //新增门诊中药处方单
    public void addChineseList(PrescriptionList prescriptionList);

    //查询门诊西药处方单
    public List<PrescriptionList> allRecipel(PrescriptionList prescriptionList);

    //收费，查询处方单
    public List<PrescriptionList> allList(String recordNo);
}
