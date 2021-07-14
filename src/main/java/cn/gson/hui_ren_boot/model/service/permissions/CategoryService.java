package cn.gson.hui_ren_boot.model.service.permissions;

import cn.gson.hui_ren_boot.model.dao.permissions.CategoryDao;
import cn.gson.hui_ren_boot.model.mapper.permissions.CategoryMapper;
import cn.gson.hui_ren_boot.model.pojos.permissions.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CategoryService {

    @Autowired
    CategoryMapper categoryMapper;

    @Autowired
    CategoryDao categoryDao;

    //分页查询加模糊查询班次
    public Object byNameByPage(Integer pageNo,Integer size,String categoryShift){
        return categoryMapper.byName(categoryShift);
    }

    //新增或修改班次
    public void addCategory(Category category){
        categoryDao.save(category);
    }

    //查询班次是否有子记录
    public List<Category> cate(Integer categoryId){
        return categoryMapper.cate(categoryId);
    }

    //删除班次
    public void delCategory(Integer categoryId){
        categoryMapper.delCategory(categoryId);
    }

    //查询所有的班次
    public List<Category> allCategory(){
        return categoryMapper.allCategory();
    }
}
