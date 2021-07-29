package cn.gson.hui_ren_boot.model.service.drug;

import cn.gson.hui_ren_boot.model.mapper.drug.DrugDeportMapper;
import cn.gson.hui_ren_boot.model.pojos.pharmacy.DrugDeport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class DrugDeportService {

    @Autowired
    DrugDeportMapper drugDeportMapper;

    //查询所有的仓库
    public List<DrugDeport> finAllDeport(){
        return drugDeportMapper.finAllDeport();
    }
}
