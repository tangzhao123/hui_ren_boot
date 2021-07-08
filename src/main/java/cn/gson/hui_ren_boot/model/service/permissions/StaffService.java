package cn.gson.hui_ren_boot.model.service.permissions;


import cn.gson.hui_ren_boot.model.mapper.permissions.StaffMapper;
import cn.gson.hui_ren_boot.model.mapper.permissions.UserMapper;
import cn.gson.hui_ren_boot.model.pojos.permissions.Staff;
import cn.gson.hui_ren_boot.model.pojos.permissions.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class StaffService {

    @Autowired
    StaffMapper staffMapper;
    @Autowired
    UserMapper userMapper;

    //查询所有员工
    public Object allStaffByPage(Integer  pageNo,Integer size,String search){
        return staffMapper.allStaff(search);
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
}
