package cn.gson.hui_ren_boot.model.service.pharmacy;

import cn.gson.hui_ren_boot.model.mapper.pharmacy.DruginfoDao;
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
    @Autowired
    DruginfoDao druginfoDao;

    //查询药品信息
    public Object allDrugByPage(Integer pageNo, Integer size,DrugInfo drugInfo){
        return drugMapper.allDrug(drugInfo);
    }
    //新增药品
    public void saveDruginfo(DrugInfo drugInfo){
        druginfoDao.save(drugInfo);

    }
    //修改药品状态
    public DrugInfo allState(String id){
        return drugMapper.allState(id);
    }
}
