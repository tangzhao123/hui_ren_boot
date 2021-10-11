package cn.gson.hui_ren_boot.model.service.hospital;

import cn.gson.hui_ren_boot.model.mapper.hospital.InformMapper;
import cn.gson.hui_ren_boot.model.mapper.hospital.LeaveMapper;
import cn.gson.hui_ren_boot.model.pojos.hospital.Leave;
import cn.gson.hui_ren_boot.model.pojos.hospital.Register;
import cn.gson.hui_ren_boot.model.pojos.outpatient.TreatmentCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.awt.*;
import java.util.List;

@Service
@Transactional
public class LeaveService {
    @Autowired
    LeaveMapper leaveMapper;
    @Autowired
    InformMapper informMapper;
    public List<Register> allRegisters(Register register){
        return  leaveMapper.allRegisters(register);
    };
    public void addLeave(Leave leave){
        Register mm=new Register();//新建住院患者实体类
        mm.setRegisterId(leave.getRegisterId());//获取住院号
        List<Register>  jk=leaveMapper.allRegisters(mm);//用住院号查询数据
        for (Register m:jk){
            TreatmentCard treatmentCard=new TreatmentCard();//新建诊疗卡
            treatmentCard.setTreatmentBalance(leave.getLeaveArrears());//获取金额
            treatmentCard.setTreatmentNo(m.getRegisterClinic());//获取查询住院患者实体里的卡号
            leaveMapper.upTreatmentCard(treatmentCard);//修改诊疗卡金额
        }



        leaveMapper.addLeave(leave);//新增出院登记
        informMapper.upInform(leave.getRegisterId());//修改出院申请表状态
    }
}
