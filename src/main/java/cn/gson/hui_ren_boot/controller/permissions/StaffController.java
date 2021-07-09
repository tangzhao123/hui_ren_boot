package cn.gson.hui_ren_boot.controller.permissions;

import cn.gson.hui_ren_boot.model.pojos.permissions.Roleinfo;
import cn.gson.hui_ren_boot.model.pojos.permissions.Staff;
import cn.gson.hui_ren_boot.model.pojos.permissions.UserInfo;
import cn.gson.hui_ren_boot.model.service.permissions.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
    public Object allStaff(Integer  pageNo,Integer size,String search){
        return staffService.allStaffByPage(pageNo,size,search);
    }

    //新增用户和员工
    @RequestMapping("add-staff")
    public String addStaff(@RequestBody Staff staff){

        Long staffId = Long.valueOf(staff.getStaffId());
        String staffName = staff.getStaffName();
        Long staffPhone =Long.valueOf(staff.getStaffPhone());
        Long sectionId = Long.valueOf(staff.getSectionName());
        Long medicalId = Long.valueOf(staff.getMedicalName());
        Long rankId = Long.valueOf(staff.getRankName());

        String userName = staff.getUserName();
        String passWord = staff.getPassWord();
        String staffCard = staff.getStaffCard();
        Staff staffs = new Staff();
        staffs.setStaffName(staffName);
        staffs.setStaffPhone(staffPhone);
        staffs.setSectionId(sectionId);
        staffs.setMedicalId(medicalId);
        staffs.setRankId(rankId);
        staffs.setStaffCard(staffCard);
        UserInfo userInfo = new UserInfo();
        userInfo.setUserName(userName);
        userInfo.setUserPossword(passWord);


        try {
            staffService.addStaff(userInfo,staffs);
            return "ok";
        } catch (Exception e) {
            e.printStackTrace();
            return "fail";
        }
    }

    //修改员工和用户
    @RequestMapping("update-staff")
    public String updateStaff(@RequestBody Staff staff){

        Long userId = Long.valueOf(staff.getUserId());
        Long staffId = Long.valueOf(staff.getStaffId());
        String staffName = staff.getStaffName();
        Long staffPhone =Long.valueOf(staff.getStaffPhone());

        Long sectionId = Long.valueOf(staff.getSectionName());
        Long medicalId = Long.valueOf(staff.getMedicalName());
        Long rankId = Long.valueOf(staff.getRankName());
        String userName = staff.getUserName();
        String passWord = staff.getPassWord();
        String staffCard = staff.getStaffCard();
        Staff staffs = new Staff();
        staffs.setStaffId(staffId);
        staffs.setStaffName(staffName);
        staffs.setStaffPhone(staffPhone);
        staffs.setSectionId(sectionId);
        staffs.setMedicalId(medicalId);
        staffs.setRankId(rankId);
        staffs.setStaffCard(staffCard);
        UserInfo userInfo = new UserInfo();
        userInfo.setUserId(userId);
        userInfo.setUserName(userName);
        userInfo.setUserPossword(passWord);

        try {
            staffService.updateStaff(userInfo,staffs);
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
}
