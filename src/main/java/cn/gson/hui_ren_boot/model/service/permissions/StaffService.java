package cn.gson.hui_ren_boot.model.service.permissions;


import cn.gson.hui_ren_boot.model.mapper.permissions.DepartureMapper;
import cn.gson.hui_ren_boot.model.mapper.permissions.StaffMapper;
import cn.gson.hui_ren_boot.model.mapper.permissions.UserMapper;
import cn.gson.hui_ren_boot.model.pojos.permissions.Departure;
import cn.gson.hui_ren_boot.model.pojos.permissions.MD5;
import cn.gson.hui_ren_boot.model.pojos.permissions.Staff;
import cn.gson.hui_ren_boot.model.pojos.permissions.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class StaffService {

    @Autowired
    StaffMapper staffMapper;
    @Autowired
    UserMapper userMapper;

    @Autowired
    DepartureMapper departureMapper;

    //查询所有员工
    public Object allStaffByPage(Integer  pageNo,Integer size,String search,Long medicalId,Long sectionId){
        return staffMapper.allStaff(search,medicalId,sectionId);
    }

    public List<Staff> findAllStaff(){
        return staffMapper.findAllStaff();
    }

    //新增员工
    public void addStaff(Staff staff) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        Long staffId = Long.valueOf(staff.getStaffId());
        String staffName = staff.getStaffName();
        Long staffPhone =Long.valueOf(staff.getStaffPhone());
        Long sectionId = Long.valueOf(staff.getSectionName());
        Long medicalId = Long.valueOf(staff.getMedicalName());
        Long rankId = Long.valueOf(staff.getRankName());

        String userName = staff.getUserName();
        String passWord = staff.getPassWord();
        String md5 = MD5.getEncryptedPwd(passWord);
        System.err.println(md5);
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
        staffMapper.addStaff(staffs); //新增员工
        userInfo.setStaffId(staff.getStaffId());
        System.err.println(staffs.getStaffId());
        //System.err.println(staffId);
        userMapper.addUser(userInfo);//新增用户
    }

    //修改员工
    public void updateStaff(Staff staff){
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
        staffMapper.updateStaff(staffs);
        userMapper.updateUser(userInfo);
    }

    //员工离职
    public void departure(Departure departure){
        departureMapper.addDeparture(departure);
        staffMapper.departure(departure.getStaffId());
    }

    //批量员工离职
    public void departures(List<Long> staffId){
        staffMapper.departures(staffId);
    }

    //查询所有的员工
    public List<Staff> findStaff(Long medicalId){
        return staffMapper.findStaff(medicalId);
    }

    //重置员工密码
    public void updatePassWord(String passWord,Long userId) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        String md5 = MD5.getEncryptedPwd(passWord);
        staffMapper.updatePassword(md5, userId);
    }
}
