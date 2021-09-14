package cn.gson.hui_ren_boot.model.service.drug;

import cn.gson.hui_ren_boot.model.mapper.drug.DrugMapper;
import cn.gson.hui_ren_boot.model.pojos.pharmacy.DrugInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DrugInfoService {

    @Autowired
    DrugMapper drugInfoMapper;

    //根据供货商，药品名称，药品类别查询药品
    public Object allDrugInfoByPage(Integer pageNo,Integer size,DrugInfo drugInfo){
        return drugInfoMapper.allDrugInfo(drugInfo);
    }

    //查询处方跟医嘱的药品
    public Object findAllDrugInfoByPage(Integer pageNo,Integer size,DrugInfo drugInfo){
        return drugInfoMapper.findAllDrugInfo(drugInfo);
    }
}
