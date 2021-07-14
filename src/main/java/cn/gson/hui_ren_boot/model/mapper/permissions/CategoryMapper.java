package cn.gson.hui_ren_boot.model.mapper.permissions;

import cn.gson.hui_ren_boot.model.pojos.permissions.Category;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CategoryMapper {

    //模糊查询和查询所有班次
    public List<Category> byName(String categoryShift);

    //查询班次是否有子记录
    public List<Category> cate(Integer categoryId);

    //删除班次
    public void delCategory(Integer categoryId);

    //查询所有的班次
    public List<Category> allCategory();
}
