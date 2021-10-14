package cn.gson.hui_ren_boot.model.service.medical;

import cn.gson.hui_ren_boot.model.mapper.medical.ZhuYuanMapper;
import cn.gson.hui_ren_boot.model.pojos.medical.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ZhuYuanService {
    @Autowired
    ZhuYuanMapper mapper;

    public Object zycomoByPage(int pageNo, int size, Test test){
        return mapper.zycomo(test);
    }
}
