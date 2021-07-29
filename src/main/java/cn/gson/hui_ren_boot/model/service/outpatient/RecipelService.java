package cn.gson.hui_ren_boot.model.service.outpatient;

import cn.gson.hui_ren_boot.model.mapper.outpatient.PrescriptionDetailMapper;
import cn.gson.hui_ren_boot.model.mapper.outpatient.PrescriptionListMapper;
import cn.gson.hui_ren_boot.model.mapper.pharmacy.DruginfoMapper;
import cn.gson.hui_ren_boot.model.pojos.outpatient.PrescriptionDetail;
import cn.gson.hui_ren_boot.model.pojos.outpatient.PrescriptionList;
import cn.gson.hui_ren_boot.model.pojos.pharmacy.DrugInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 门诊开处方
 */
@Service
@Transactional
public class RecipelService {
    @Autowired
    PrescriptionListMapper listMapper;
    @Autowired
    PrescriptionDetailMapper detailMapper;
    @Autowired
    DruginfoMapper druginfoMapper;

    //查询药品
    public List<DrugInfo> allDrug(DrugInfo drugInfo){
        return druginfoMapper.allDrug(drugInfo);
    }

    //新增门诊西药处方单和处方详单
    public void recipel(PrescriptionList prescriptionList, List<PrescriptionDetail> details){
        listMapper.addList(prescriptionList);
        detailMapper.addDetail(details, prescriptionList.getPrescriptionNo());
    }

    //新增门诊中药处方单和处方详单
    public void recipelChinese(PrescriptionList prescriptionList, List<PrescriptionDetail> details){
        listMapper.addChineseList(prescriptionList);
        detailMapper.addChineseDetail(details, prescriptionList.getPrescriptionNo());
    }

    //查询门诊西药处方单
    public List<PrescriptionList> allRecipel(PrescriptionList prescriptionList){
        return listMapper.allRecipel(prescriptionList);
    }

    //根据处方号查询处方详单
    public List<PrescriptionDetail> selNo(String prescriptionNo){
        return detailMapper.selNo(prescriptionNo);
    }
}
