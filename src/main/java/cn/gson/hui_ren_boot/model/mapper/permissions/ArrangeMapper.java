package cn.gson.hui_ren_boot.model.mapper.permissions;

import cn.gson.hui_ren_boot.model.pojos.permissions.Arrange;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ArrangeMapper {

    //新增排班
    public void addArrange(Arrange arrange);

    //删除排班
    public void delArrange(Long arrangeId);

    //根据员工编号查询所有的排班记录
    public List<Arrange> findAllArrange(Long staffId);

    //根据时间跟班次员工编号查询是否存在员工
    public List<Arrange> allStaffId(String arrangeStart,Long categoryId,List<Integer> staffId);

    //根据科室编号查询排班记录
    public List<Arrange> arrangeByMedical(@Param("medicalId") Long medicalId,@Param("staffId") Long staffId);
}
