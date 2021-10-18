package cn.gson.hui_ren_boot.model.service.hospital;

import cn.gson.hui_ren_boot.model.mapper.hospital.InformMapper;
import cn.gson.hui_ren_boot.model.mapper.hospital.LeaveMapper;
import cn.gson.hui_ren_boot.model.mapper.hospital.RecordformMapper;
import cn.gson.hui_ren_boot.model.pojos.hospital.ChargeVo;
import cn.gson.hui_ren_boot.model.pojos.hospital.Leave;
import cn.gson.hui_ren_boot.model.pojos.hospital.Register;
import cn.gson.hui_ren_boot.model.pojos.outpatient.TreatmentCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class LeaveService {
    @Autowired
    LeaveMapper leaveMapper;
    @Autowired
    InformMapper informMapper;
    @Autowired
    RecordformMapper recordformMapper;
    public List<Register> allRegisters(Register register){
        return  leaveMapper.allRegisters(register);
    };
    public void addLeave(Leave leave){
        Register mm=new Register();//新建住院患者实体类
        mm.setRegisterId(leave.getRegisterId());//获取住院号
        List<Register>  jk=leaveMapper.allRegisters(mm);//用住院号查询数据
        for (Register m:jk){
            //新建诊疗卡实体类
            TreatmentCard treatmentCard=new TreatmentCard();
            //获取金额

            //获取查询住院患者实体里的卡号
            treatmentCard.setTreatmentNo(m.getRegisterClinic());
            //修改诊疗卡金额
            leaveMapper.upTreatmentCard(treatmentCard);
        }
//查病人病床
        Register hj= leaveMapper.allRegistew(leave.getRegisterId());
//修改病人信息住院状态
        leaveMapper.upRegisters(leave.getRegisterId());
//还病房数量
        recordformMapper.upRecorForm2(hj.getSickbedMark());
//修改病床状态
        recordformMapper.upRecorForm5(hj.getSickbedMark());
//修改病房记录
        recordformMapper.upRecorForm4(hj.getSickbedMark());
//清空病人信息的床位号
        leaveMapper.upRegisters2(leave.getRegisterId());
//新增出院登记
        leaveMapper.addLeave(leave);
//修改出院申请表状态
        informMapper.upInform(leave.getRegisterId());
    }
    //分页查询
    public Object allLeaveByPage (Integer pageNo, Integer size,Leave leave){//查询出院记录
        return leaveMapper.allLeave(leave);
    }
    //联合查询打印
    public List<ChargeVo>dayLeave(Register register){
        Register hj= leaveMapper.allRegistew(register.getRegisterId());//查询病人的电话号
        ChargeVo phone=new ChargeVo();
        phone.setAdviceId(hj.getRegisterPhone());
        phone.setRegisterId(register.getRegisterId());
      return   leaveMapper.dayLeave(phone);
    }
}
