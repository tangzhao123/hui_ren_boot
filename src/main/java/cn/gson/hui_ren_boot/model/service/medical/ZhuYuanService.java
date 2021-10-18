package cn.gson.hui_ren_boot.model.service.medical;

import cn.gson.hui_ren_boot.model.mapper.medical.ZhuYuanMapper;
import cn.gson.hui_ren_boot.model.pojos.medical.Combinspection;
import cn.gson.hui_ren_boot.model.pojos.medical.Comboitem;
import cn.gson.hui_ren_boot.model.pojos.medical.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZhuYuanService {
    @Autowired
    ZhuYuanMapper mapper;

    //修改体检的状态
    public void updateitem(String testAccount){
        mapper.updateitem(testAccount);
    }

    //新增检验结果
    public void zyspection(Combinspection combinspection){
        mapper.zyspection(combinspection);
    }

    public List<Comboitem> zyitem(String testAccount){
        return mapper.zyitem(testAccount);
    }

    public Object zycomoByPage(int pageNo, int size, Test test){
        return mapper.zycomo(test);
    }
}
