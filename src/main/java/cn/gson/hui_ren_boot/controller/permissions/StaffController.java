package cn.gson.hui_ren_boot.controller.permissions;

import cn.gson.hui_ren_boot.model.pojos.permissions.Departure;
import cn.gson.hui_ren_boot.model.pojos.permissions.Roleinfo;
import cn.gson.hui_ren_boot.model.pojos.permissions.Staff;
import cn.gson.hui_ren_boot.model.pojos.permissions.UserInfo;
import cn.gson.hui_ren_boot.model.service.permissions.*;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class StaffController {

    @Autowired
    StaffService staffService;

    @Autowired
    SectionService sectionService;

    @Autowired
    RankService rankService;

    @Autowired
    MedicalService medicalService;

    @Autowired
    RoleInfoService roleInfoService;

    //查询所有员工
    @GetMapping("staff-list")
    public Object allStaff(Integer  pageNo,Integer size,String search,Long medicalId,Long sectionId){
        return staffService.allStaffByPage(pageNo,size,search,medicalId,sectionId);
    }

    @GetMapping("allStaff-list")
    public List<Staff> findAllStaff(){
        return staffService.findAllStaff();
    }

    //新增用户和员工
    @RequestMapping("add-staff")
    public String addStaff(@RequestBody Staff staff){
        System.err.println(staff);
        try {
            staffService.addStaff(staff);
            return "ok";
        } catch (Exception e) {
            e.printStackTrace();
            return "fail";
        }
    }

    //修改员工和用户
    @RequestMapping("update-staff")
    public String updateStaff(@RequestBody Staff staff){
        try {
            staffService.updateStaff(staff);
            return "ok";
        } catch (Exception e) {
            e.printStackTrace();
            return "fail";
        }
    }

    //查询所有的角色
    @RequestMapping("roleInfos-list")
    public List<Roleinfo> allRole(){
        return roleInfoService.allRole();
    }

    //查询用户已经拥有的权限
    @RequestMapping("user-role")
    public List<Integer> userRole(Long userId){
        return roleInfoService.userRole(userId);
    }

    //给用户授权
    @PostMapping("save-grade-role")
    public String saveGrade(@RequestParam("grant") String grant){
        JSONObject o = JSONObject.parseObject(grant);
        Long userId = Long.valueOf(o.get("userId").toString());
        List<Long> role = JSONArray.parseArray(o.get("roles").toString(),Long.TYPE);
        try {
            roleInfoService.saveGrant(userId,role);
            return "ok";
        } catch (Exception e) {
            e.printStackTrace();
            return "fail";
        }

    }

    //员工离职
    @RequestMapping("departure")
    public String departure(@RequestBody Departure departure){
        try {
            staffService.departure(departure);
            return "ok";
        } catch (Exception e) {
            e.printStackTrace();
            return "fail";
        }
    }

    //批量员工离职
    @RequestMapping("departures")
    public String departures(String staffId){
        String str[] = staffId.split(",");
        List<Long> list = new ArrayList<>();
        for (String s : str) {
            if(s!=null && !s.equals("")){
               list.add(Long.parseLong(s));
            }
        }
        try {
            staffService.departures(list);
            return "ok";
        } catch (Exception e) {
            e.printStackTrace();
            return "fail";
        }
    }

    //重置密码
    @RequestMapping("update-password")
    public String update(@RequestBody Staff staff){
       Long userId = staff.getUserId();
       String card = staff.getStaffCard();
       String passWord = card.substring(card.length()-6,card.length());
        try {
           staffService.updatePassWord(passWord,userId);
            return "ok";
        } catch (Exception e) {
            e.printStackTrace();
            return "fail";
        }
    }
}
