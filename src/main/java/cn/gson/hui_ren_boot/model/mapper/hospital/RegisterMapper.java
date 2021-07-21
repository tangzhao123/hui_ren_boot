package cn.gson.hui_ren_boot.model.mapper.hospital;

import cn.gson.hui_ren_boot.model.pojos.hospital.Register;
import cn.gson.hui_ren_boot.model.pojos.outpatient.OutpatientRegister;
import cn.gson.hui_ren_boot.model.pojos.outpatient.TreatmentCard;
import cn.gson.hui_ren_boot.model.pojos.outpatient.TreatmentRecharge;
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
}
