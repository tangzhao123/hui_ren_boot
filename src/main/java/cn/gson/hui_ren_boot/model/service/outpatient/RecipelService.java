package cn.gson.hui_ren_boot.model.service.outpatient;

import cn.gson.hui_ren_boot.model.mapper.drug.DrugMapper;
import cn.gson.hui_ren_boot.model.mapper.outpatient.*;
import cn.gson.hui_ren_boot.model.mapper.pharmacy.DruginfoMapper;
import cn.gson.hui_ren_boot.model.pojos.medical.Comboitem;
import cn.gson.hui_ren_boot.model.pojos.outpatient.*;
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
    @Autowired
    RowNumbersMapper rowNumbersMapper;
    @Autowired
    ComboitemsMapper comboitemMapper;
    @Autowired
    TestItemsMapper teatItemsMapper;
    @Autowired
    TestDetailMapper testDetailMapper;
    @Autowired
    DrugMapper drugMapper;

    //查询药品
    public List<DrugInfo> allDrug(DrugInfo drugInfo){
        drugInfo.setDrugState(1L);
        return drugMapper.findAllDrugInfo(drugInfo);
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

    //查询排号
    public List<RowNumbers> allNumber(int medicalId,int staffId,int rankId){
        return rowNumbersMapper.allNumber(medicalId, staffId,rankId);
    }

    //接诊，删除当前接诊的排号
    public void delRow(String bookingNo){
        rowNumbersMapper.delRow(bookingNo);
    }

    //过号，根据挂号单修改id为最后一位
    public void editRow(String bookingNo){
        rowNumbersMapper.editRow(bookingNo);
    }

    //查询检验项目
    public List<Comboitem> allCom(String itemName){
        return comboitemMapper.allCom(itemName);
    }

    //开检验项目和新增检验项目详单
    public void addItems(TestItems testItems, List<Comboitem> comboitems){
        teatItemsMapper.addItem(testItems);
        testDetailMapper.addItemDetail(comboitems,testItems.getTestNumber());
    }
}
