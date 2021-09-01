package cn.gson.hui_ren_boot.model.mapper.hospital;

import cn.gson.hui_ren_boot.model.pojos.hospital.Additional;
import cn.gson.hui_ren_boot.model.pojos.hospital.Operation;
import cn.gson.hui_ren_boot.model.pojos.hospital.Surgeryfor;
import cn.gson.hui_ren_boot.model.pojos.permissions.Medical;
import cn.gson.hui_ren_boot.model.pojos.permissions.Staff;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OperationMapper {
    public List<Additional> allOperation();
    public List<Staff>allStaff(Staff staffu);
    public List<Staff>allStaff2();
    public Medical allMedicals(Medical staffu);
    public void addSurgeryfor(Surgeryfor surgeryfor);
    public List<Surgeryfor> allSurgeryfor(Surgeryfor surgeryfor);
    public void deleteSurgeryfor(Surgeryfor surgeryfor);
}
