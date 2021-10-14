package cn.gson.hui_ren_boot.model.service.medical;

import cn.gson.hui_ren_boot.model.mapper.medical.ShouShuMapper;
import cn.gson.hui_ren_boot.model.pojos.permissions.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShouSHuService {
    @Autowired
    ShouShuMapper mapper;

    public List<Staff> zhudao(){
        return mapper.zhudao();
    }

    public List<Staff> mazui(){
        return mapper.mazui();
    }
}
