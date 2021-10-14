package cn.gson.hui_ren_boot.controller.permissions;

import cn.gson.hui_ren_boot.model.pojos.permissions.Arrange;
import cn.gson.hui_ren_boot.model.pojos.permissions.Category;
import cn.gson.hui_ren_boot.model.pojos.permissions.Medical;
import cn.gson.hui_ren_boot.model.pojos.permissions.Staff;
import cn.gson.hui_ren_boot.model.service.permissions.ArrangeService;
import cn.gson.hui_ren_boot.model.service.permissions.CategoryService;
import cn.gson.hui_ren_boot.model.service.permissions.MedicalService;
import cn.gson.hui_ren_boot.model.service.permissions.StaffService;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


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
    public String addArrange(@RequestBody Map<String,Object> datas){
        //员工编号
        List<Integer> staffId = (List<Integer>) datas.get("staffIds");
        //排班实体类
        String str = JSON.toJSONString(datas.get("arrange"));
        Arrange arrange = JSON.parseObject(str,Arrange.class);
        //新增排班
        List<Arrange> list = new ArrayList<>();
        for (int i = 0; i < staffId.size(); i++) {
            list.add(new Arrange(staffId.get(i).longValue(),arrange.getCategoryId(),arrange.getArrangeStart(),arrange.getArrangeEnd()));
        }
        SimpleDateFormat sf = new SimpleDateFormat("yyy-MM-dd");
        String start = sf.format(arrange.getArrangeStart());
        List<Arrange> arranges = arrangeService.allStaffId(start,arrange.getCategoryId(),staffId);
        try {
            if(arranges.isEmpty()){
                arrangeService.addArrange(list);
                return "ok";
            }else{
                return "have";
            }

        } catch (Exception e) {
            e.printStackTrace();
            return "fail";
        }
    }

    //根据员工编号查询排班
    @RequestMapping("arrange-byId")
    public List<Arrange> allArrange(Long staffId){
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
