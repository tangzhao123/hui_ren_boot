package cn.gson.hui_ren_boot.model.service.permissions;

import cn.gson.hui_ren_boot.model.mapper.drug.CheckInfoMapper;
import cn.gson.hui_ren_boot.model.pojos.permissions.CheckInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CheckInfoService {

    @Autowired
    CheckInfoMapper checkInfoMapper;

    //新增审批记录
    public void addCheckInfo(CheckInfo checkInfo){
        checkInfoMapper.addCheckInfo(checkInfo);
    }
}
