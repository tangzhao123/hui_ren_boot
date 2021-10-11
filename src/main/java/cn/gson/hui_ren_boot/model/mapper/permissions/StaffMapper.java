package cn.gson.hui_ren_boot.model.mapper.permissions;

import cn.gson.hui_ren_boot.model.pojos.permissions.Staff;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


import java.util.List;
import java.util.Map;

@Mapper
public interface StaffMapper {

    //查询所有员工
    public List<Staff> allStaff(String search);

    public List<Staff> findAllStaff();

    //新增员工
    public void addStaff(Staff staff);

    //修改员工
    public void updateStaff(Staff staff);

    //员工离职
    public void departure(Long staffId);

    //批量员工离职
    public void departures(List<Long> staffId);

    //查询所有的员工
    public List<Staff> findStaff(Long medicalId);

    //重置用户密码
    public void updatePassword(@Param("passWord") String passWord, @Param("userId") Long usrId);

}
