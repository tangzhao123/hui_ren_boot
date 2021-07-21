package cn.gson.hui_ren_boot.controller.permissions;

import cn.gson.hui_ren_boot.model.pojos.permissions.Arrange;
import cn.gson.hui_ren_boot.model.pojos.permissions.Category;
import cn.gson.hui_ren_boot.model.pojos.permissions.Medical;
import cn.gson.hui_ren_boot.model.pojos.permissions.Staff;
import cn.gson.hui_ren_boot.model.service.permissions.ArrangeService;
import cn.gson.hui_ren_boot.model.service.permissions.CategoryService;
import cn.gson.hui_ren_boot.model.service.permissions.MedicalService;
import cn.gson.hui_ren_boot.model.service.permissions.StaffService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestBody;
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

    @Autowired
    MedicalService medicalService;

    //查询所有的班次
    @RequestMapping("cate-list")
    public List<Category> allCategory(){
        return categoryService.allCategory();
    }

    //查询所有的科室
    @RequestMapping("all-medical")
    public List<Medical> allMedical(){
        return medicalService.allMedical();
    }

    //查询所有的员工
    @RequestMapping("findStaff")
    public List<Staff> findStaff(Long medicalId){
        return staffService.findStaff(medicalId);
    }

    //新增排班
    @RequestMapping("add-arrange")
    public String addArrange(@RequestBody Arrange arrange){
        try {
            arrangeService.addArrange(arrange);
            return "ok";
        } catch (Exception e) {
            e.printStackTrace();
            return "fail";
        }
    }

    //根据员工编号查询排班
    @RequestMapping("arrange-byId")
    public List<Arrange> allArrange(Long staffId){
        System.out.println(staffId);
        return arrangeService.findAllArrange(staffId);
    }

    //根据科室编号查询排班
    @RequestMapping("arrangeByMedical")
    public List<Arrange> arrangeByMedical(Long medicalId,Long staffId){
        return arrangeService.arrangeByMedical(medicalId,staffId);
    }


    //删除排班
    @RequestMapping("del-arrange")
    public String delArrange(Long arrangeId){
        try {
            arrangeService.delArrange(arrangeId);
            return "ok";
        } catch (Exception e) {
            e.printStackTrace();
            return "fail";
        }
    }
}
