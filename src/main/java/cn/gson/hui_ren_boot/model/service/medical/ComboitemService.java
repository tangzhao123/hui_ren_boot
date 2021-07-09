package cn.gson.hui_ren_boot.model.service.medical;

import cn.gson.hui_ren_boot.model.mapper.medical.ComboitemMapper;
import cn.gson.hui_ren_boot.model.pojos.medical.Comboitem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ComboitemService {
    @Autowired
    ComboitemMapper com;//体检项目

    //体检项目查询
    public List<Comboitem> selectAll(){
        return com.selectAll();
    }
}
