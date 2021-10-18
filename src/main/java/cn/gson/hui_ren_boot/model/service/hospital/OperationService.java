package cn.gson.hui_ren_boot.model.service.hospital;

import cn.gson.hui_ren_boot.model.mapper.hospital.OperationMapper;
import cn.gson.hui_ren_boot.model.mapper.medical.ApplyrecordMapper;
import cn.gson.hui_ren_boot.model.pojos.hospital.Additional;
import cn.gson.hui_ren_boot.model.pojos.hospital.Surgeryfor;
import cn.gson.hui_ren_boot.model.pojos.medical.Applyrecord;
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
    @Autowired
    ApplyrecordMapper applyrecordmapper;
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
    public void addSurgeryfor(Surgeryfor surgeryfor){//新增手术申请表并且修改诊疗卡数据收费并新增一条扣费记录

        operationMapper.addSurgeryfor(surgeryfor);//新增手术申请单
        Applyrecord applyrecord=new Applyrecord();
        applyrecord.setAdditionalMoney(surgeryfor.getAdditionalMoney());//金钱
        applyrecord.setAdditionalName(surgeryfor.getAdditionalName());//手术名
        applyrecord.setRegisterId(surgeryfor.getRegisterId());//住院号
        applyrecord.setRegisterName(surgeryfor.getRegisterName());//患者名
        applyrecordmapper.insertApp(applyrecord); //新增手术扣费单
        applyrecordmapper.uptApp(surgeryfor.getAdditionalMoney(),surgeryfor.getAdditionalBlade()); //诊疗卡余额
        }
    public List<Surgeryfor> allSurgeryfor(Surgeryfor surgeryfor){
        return operationMapper.allSurgeryfor(surgeryfor);
    }
    public void deleteSurgeryfor(Surgeryfor surgeryfor){
        operationMapper.deleteSurgeryfor(surgeryfor);
    }
}
