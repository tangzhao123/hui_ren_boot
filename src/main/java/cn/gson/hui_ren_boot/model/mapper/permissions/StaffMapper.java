package cn.gson.hui_ren_boot.model.mapper.permissions;

import cn.gson.hui_ren_boot.model.pojos.permissions.Staff;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StaffMapper {

    //查询所有员工
    public List<Staff> allStaff(String search);

    //新增员工
    public void addStaff(Staff staff);

    //修改员工
    public void updateStaff(Staff staff);
}
