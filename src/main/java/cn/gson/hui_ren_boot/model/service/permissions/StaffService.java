package cn.gson.hui_ren_boot.model.service.permissions;


import cn.gson.hui_ren_boot.model.mapper.permissions.DepartureMapper;
import cn.gson.hui_ren_boot.model.mapper.permissions.StaffMapper;
import cn.gson.hui_ren_boot.model.mapper.permissions.UserMapper;
import cn.gson.hui_ren_boot.model.pojos.permissions.Departure;
import cn.gson.hui_ren_boot.model.pojos.permissions.Staff;
import cn.gson.hui_ren_boot.model.pojos.permissions.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    public void addStaff(UserInfo userInfo,Staff staff){
        staffMapper.addStaff(staff); //新增员工
        userInfo.setStaffId(staff.getStaffId());
        userMapper.addUser(userInfo);//新增用户
    }

    //修改员工
    public void updateStaff(UserInfo userInfo,Staff staff){
        staffMapper.updateStaff(staff);
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
    public void updatePassWord(String passWord,Long userId){
        staffMapper.updatePassword(passWord, userId);
    }
}
