package cn.gson.hui_ren_boot.model.service.permissions;


import cn.gson.hui_ren_boot.model.mapper.permissions.ArrangeMapper;
import cn.gson.hui_ren_boot.model.pojos.permissions.Arrange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ArrangeService {

    @Autowired
    ArrangeMapper arrangeMapper;


    //根据员工编号查询所有的排班记录
    public List<Arrange> findAllArrange(Long staffId){
        return arrangeMapper.findAllArrange(staffId);
    }

    //根据科室编号查询排班记录
    public List<Arrange> arrangeByMedical(Long medicalId,Long staffId){
        return arrangeMapper.arrangeByMedical(medicalId,staffId);
    }

    //根据时间跟班次员工编号查询是否存在员工
    public List<Arrange> allStaffId(String arrangeStart,Long categoryId,List<Integer> staffId){
        return arrangeMapper.allStaffId(arrangeStart, categoryId, staffId);
    }

    //新增排班
    public void addArrange(List<Arrange> list){
        for (Arrange arrange : list) {
            System.out.println(arrange);
            arrangeMapper.addArrange(arrange);
        }

    }

    //删除排班
    public void delArrange(Long arrangeId){
        arrangeMapper.delArrange(arrangeId);
    }
}
