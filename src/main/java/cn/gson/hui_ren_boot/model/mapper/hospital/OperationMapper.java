package cn.gson.hui_ren_boot.model.mapper.hospital;

import cn.gson.hui_ren_boot.model.pojos.hospital.Additional;
import cn.gson.hui_ren_boot.model.pojos.hospital.Surgeryfor;
import cn.gson.hui_ren_boot.model.pojos.permissions.Medical;
import cn.gson.hui_ren_boot.model.pojos.permissions.Staff;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OperationMapper {
    public List<Additional> allOperation(Additional shu);//查询搜书项目
    public List<Staff>allStaff(Staff staffu);
    public List<Staff>allStaff2();
    public Medical allMedicals(Medical staffu);
    public void addSurgeryfor(Surgeryfor surgeryfor);//添加手术申请表
    public List<Surgeryfor> allSurgeryfor(Surgeryfor surgeryfor);//查询手术申请
    public void deleteSurgeryfor(Surgeryfor surgeryfor);//删除手术申请
    public void deApplyrecord(Surgeryfor surgeryfor);//删除手术记录
}
