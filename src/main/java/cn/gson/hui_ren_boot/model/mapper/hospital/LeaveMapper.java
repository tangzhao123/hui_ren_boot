package cn.gson.hui_ren_boot.model.mapper.hospital;

import cn.gson.hui_ren_boot.model.pojos.hospital.ChargeVo;
import cn.gson.hui_ren_boot.model.pojos.hospital.Leave;
import cn.gson.hui_ren_boot.model.pojos.hospital.Register;
import cn.gson.hui_ren_boot.model.pojos.outpatient.TreatmentCard;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LeaveMapper {
  public List<Register> allRegisters(Register register);//查询

  public void addLeave(Leave leave);//添加

  public void upTreatmentCard(TreatmentCard treatmentCard);//修改诊疗卡金额
  public void upRegisters(String  registerId);//修改住院信息表

  //查住院患者表
  public Register  allRegistew(String  registerId);
  //清空病人信息的床位号
  public void upRegisters2(String registerId);
  public List<Leave>allLeave(Leave leave);
  public List<ChargeVo>dayLeave(ChargeVo chargeVo);//联合查询打印
}
