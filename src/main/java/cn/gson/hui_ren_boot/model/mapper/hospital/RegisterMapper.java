package cn.gson.hui_ren_boot.model.mapper.hospital;

import cn.gson.hui_ren_boot.model.pojos.hospital.Register;
import cn.gson.hui_ren_boot.model.pojos.outpatient.TreatmentCard;
import cn.gson.hui_ren_boot.model.pojos.outpatient.TreatmentRecharge;
import cn.gson.hui_ren_boot.model.pojos.permissions.Arrange;
import cn.gson.hui_ren_boot.model.pojos.permissions.Medical;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface RegisterMapper {
    public List<Register> allRegis(Register inputboxs);//查询分页
    public List<Register> allRegist(Register inputboxs);//查询分页
    public void addRegister(Register ter);//新增
    public Register allRegiMedical(@Param("registerClinic") String clinic ,@Param("registerId")String id);//修改查询诊疗卡
    public void upRegister(Register ters);//修改
    public void upMajor(Register terx);//转科
    public void upMedicalCard(TreatmentCard k);//修改金额
    public void reCharge(TreatmentRecharge p);//新增记录
    public TreatmentCard selRecharge(String treatmentNo);//查询机诊疗卡余额
    public List<TreatmentRecharge>selseRecharge(@Param("treatmentNo") String treatmentNo);//查询诊疗卡记录
    public List<Arrange>chaArrange(long medicalId);//排班表查询
    public Medical chaMedical(Medical medical);//查询科室
    public Register allRegister(String registerId);//查询床位
    public List<Register>allR(Register register);//查询病人
    public Medical allMedicals(String  medicalName) ;//查询科室
    public List<Register>allRegist2(Register inputboxs);//住院医师站
}
