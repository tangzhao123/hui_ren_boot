package cn.gson.hui_ren_boot.model.service.permissions;


import cn.gson.hui_ren_boot.model.mapper.permissions.ArrangeMapper;
import cn.gson.hui_ren_boot.model.pojos.permissions.Arrange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ArrangeService {

    @Autowired
    ArrangeMapper arrangeMapper;



    //分页查询所有的排班
    public Object allArrangeByPage(Integer pageNo,Integer size,String search){
        return arrangeMapper.allArrange(search);
    }

    //新增排班
    public void addArrange(Arrange arrange){
        arrangeMapper.addArrange(arrange);
    }
}
