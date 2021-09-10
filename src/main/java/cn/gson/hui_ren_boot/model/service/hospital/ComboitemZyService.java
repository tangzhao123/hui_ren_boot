package cn.gson.hui_ren_boot.model.service.hospital;

import cn.gson.hui_ren_boot.model.mapper.hospital.ComboitemZyMapper;
import cn.gson.hui_ren_boot.model.pojos.medical.Comboitem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class ComboitemZyService {
    @Autowired
    ComboitemZyMapper comboitemZyMapper;
    public Object allComboitemByPage(Integer pageNo, Integer size, Comboitem inputboxs ){//分页查询
        return comboitemZyMapper.allComboitem(inputboxs);
    }
}
