package cn.gson.hui_ren_boot.model.service.permissions;

import cn.gson.hui_ren_boot.model.mapper.permissions.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

    @Autowired
    CategoryMapper categoryMapper;

    //分页查询加模糊查询班次
    public Object byNameByPage(Integer pageNo,Integer size,String categoryShift){
        return categoryMapper.byName(categoryShift);
    }
}
