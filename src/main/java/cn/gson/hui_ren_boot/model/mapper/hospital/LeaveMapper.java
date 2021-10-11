package cn.gson.hui_ren_boot.model.mapper.hospital;

import cn.gson.hui_ren_boot.model.pojos.hospital.Leave;
import cn.gson.hui_ren_boot.model.pojos.hospital.Register;
import cn.gson.hui_ren_boot.model.pojos.outpatient.TreatmentCard;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Mapper
public interface LeaveMapper {
  public List<Register> allRegisters(Register register);//查询

  public void addLeave(Leave leave);//添加

  public void upTreatmentCard(TreatmentCard treatmentCard);//修改诊疗卡金额
}
