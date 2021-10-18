package cn.gson.hui_ren_boot.model.mapper.hospital;

import cn.gson.hui_ren_boot.model.pojos.hospital.Hospitalcare;
import cn.gson.hui_ren_boot.model.pojos.hospital.InspectDebit;
import cn.gson.hui_ren_boot.model.pojos.hospital.Register;
import cn.gson.hui_ren_boot.model.pojos.medical.Applyrecord;
import cn.gson.hui_ren_boot.model.pojos.nursestation.Prndebit;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BreakdownMapper {
    public List<Register> selectBreak(Register register);
    public List<Register> allPar(Register register);///患者信息
    public List<Hospitalcare>allHospitalcare(String register);//护理床位记录查询
    public List<Prndebit>allPrndebit(String register);//查询医嘱扣费记录表
    public List<InspectDebit>allInspectDebit(String register);//检验扣费查询
    public List<Applyrecord>allApplyrecord(String register);//手术扣费记录表查询
    public Register akkRegister(Register register);//患者查询
}
