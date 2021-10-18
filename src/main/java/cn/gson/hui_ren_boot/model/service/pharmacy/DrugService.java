package cn.gson.hui_ren_boot.model.service.pharmacy;

import cn.gson.hui_ren_boot.model.mapper.pharmacy.DruginfoMapper;
import cn.gson.hui_ren_boot.model.pojos.pharmacy.DrugInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class DrugService {
    @Autowired
    DruginfoMapper drugMapper;

    //查询处方选药/查药品信息
    public Object allDrugByPage(Integer pageNo, Integer size,String typeName,String drugName){
        return drugMapper.allDrug(typeName,drugName);
    }
    //修改药品状态
    public void allState(DrugInfo drugInfo){
        System.out.println(drugInfo);
        drugMapper.allState(drugInfo);
    }

    //新增药品
    public void addDrug(DrugInfo drugInfo){
        drugMapper.addDrug(drugInfo);
    }

    //修改药品字段
    public void upMange(DrugInfo drugInfo){
        drugMapper.upMange(drugInfo);
    }
}
