package cn.gson.hui_ren_boot.model.service.hospital;

import cn.gson.hui_ren_boot.model.mapper.hospital.OperationMapper;
import cn.gson.hui_ren_boot.model.pojos.hospital.Additional;
import cn.gson.hui_ren_boot.model.pojos.hospital.Operation;
import cn.gson.hui_ren_boot.model.pojos.hospital.Surgeryfor;
import cn.gson.hui_ren_boot.model.pojos.permissions.Medical;
import cn.gson.hui_ren_boot.model.pojos.permissions.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class OperationService {
    @Autowired
    OperationMapper operationMapper;
    public List<Additional> allOperation(){
        return operationMapper.allOperation();
    }
    public List<Staff>allStaff(Staff staffu){
        return operationMapper.allStaff(staffu);
    }
    public List<Staff>allStaff2(){return  operationMapper.allStaff2();

    }
    public Medical allMedicals(Medical staffu){
        return operationMapper.allMedicals(staffu);
    }
    public void addSurgeryfor(Surgeryfor surgeryfor){
        operationMapper.addSurgeryfor(surgeryfor);
        }
    public List<Surgeryfor> allSurgeryfor(Surgeryfor surgeryfor){
        return operationMapper.allSurgeryfor(surgeryfor);
    }
    public void deleteSurgeryfor(Surgeryfor surgeryfor){
        operationMapper.deleteSurgeryfor(surgeryfor);
    }
}
