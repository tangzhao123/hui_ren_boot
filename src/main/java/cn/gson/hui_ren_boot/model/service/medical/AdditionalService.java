package cn.gson.hui_ren_boot.model.service.medical;

import cn.gson.hui_ren_boot.model.mapper.medical.AdditionalMapper;
import cn.gson.hui_ren_boot.model.pojos.hospital.Additional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdditionalService {
    @Autowired
    AdditionalMapper mapper;

    //修改手术项目
    public void updateitional(Additional additional){
        mapper.updateitional(additional);
    }

    //    新增手术项目
    public void additional(Additional additional){
        mapper.additional(additional);
    }
    //查询手术项目
    public Object selectitonalByPage(int pageNo,int size,Additional additional){
        return mapper.selectitonal(additional);
    }
}
