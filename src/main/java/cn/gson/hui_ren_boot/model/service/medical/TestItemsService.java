package cn.gson.hui_ren_boot.model.service.medical;

import cn.gson.hui_ren_boot.model.mapper.medical.TestItemMapper;
import cn.gson.hui_ren_boot.model.pojos.outpatient.TestItems;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestItemsService {
    @Autowired
    TestItemMapper itemsMapper;

    //查询要检验的项目
    public Object selitemByPage (int pageNo, int size, TestItems items){
        return itemsMapper.selitem(items);
    }
}
