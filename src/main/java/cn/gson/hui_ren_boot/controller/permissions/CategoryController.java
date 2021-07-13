package cn.gson.hui_ren_boot.controller.permissions;

import cn.gson.hui_ren_boot.model.pojos.permissions.Category;
import cn.gson.hui_ren_boot.model.service.permissions.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {

    @Autowired
    CategoryService categoryService;


    @GetMapping("category-byName")
    public Object byName(Integer pageNo,Integer size,String categoryShift){
        return categoryService.byNameByPage(pageNo,size,categoryShift);
    }


    @RequestMapping("add-category")
    public String addCategory(@RequestBody Category  category){
        try {
           categoryService.addCategory(category);
            return "ok";
        } catch (Exception e) {
            e.printStackTrace();
            return "fail";
        }
    }
}
