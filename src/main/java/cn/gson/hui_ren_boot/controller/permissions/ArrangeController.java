package cn.gson.hui_ren_boot.controller.permissions;


import cn.gson.hui_ren_boot.model.pojos.permissions.Arrange;
import cn.gson.hui_ren_boot.model.pojos.permissions.Category;
import cn.gson.hui_ren_boot.model.pojos.permissions.Staff;
import cn.gson.hui_ren_boot.model.service.permissions.ArrangeService;
import cn.gson.hui_ren_boot.model.service.permissions.CategoryService;
import cn.gson.hui_ren_boot.model.service.permissions.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ArrangeController {

    @Autowired
    ArrangeService arrangeService;

    @Autowired
    CategoryService categoryService;

    @Autowired
    StaffService staffService;


    //分页和模糊查询
    @RequestMapping("arrange-list")
    public Object allArrange(Integer pageNo,Integer size,String search){
        return arrangeService.allArrangeByPage(pageNo,size,search);
    }

    //查询所有的班次
    @RequestMapping("cate-list")
    public List<Category> allCategory(){
        return categoryService.allCategory();
    }

    //查询所有的员工
    @RequestMapping("findStaff")
    public List<Staff> findStaff(){
        return staffService.findStaff();
    }

    //新增排班
    @RequestMapping("add-arrange")
    public String addArrange(Arrange arrange){
        try {
            arrangeService.addArrange(arrange);
            return "ok";
        } catch (Exception e) {
            e.printStackTrace();
            return "fail";
        }
    }
}
