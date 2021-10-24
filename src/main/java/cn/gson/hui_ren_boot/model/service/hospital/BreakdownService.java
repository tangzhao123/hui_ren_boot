package cn.gson.hui_ren_boot.model.service.hospital;

import cn.gson.hui_ren_boot.model.mapper.hospital.BreakdownMapper;
import cn.gson.hui_ren_boot.model.mapper.hospital.LeaveMapper;
import cn.gson.hui_ren_boot.model.pojos.hospital.Breakdown;
import cn.gson.hui_ren_boot.model.pojos.hospital.Hospitalcare;
import cn.gson.hui_ren_boot.model.pojos.hospital.InspectDebit;
import cn.gson.hui_ren_boot.model.pojos.hospital.Register;
import cn.gson.hui_ren_boot.model.pojos.medical.Applyrecord;
import cn.gson.hui_ren_boot.model.pojos.nursestation.Prndebit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class BreakdownService {
    @Autowired
    BreakdownMapper breakdownMapper;
    @Autowired
    LeaveMapper leaveMapper;
    public List<Breakdown> selectBreak(Register breakdown){//联合查询费用汇总
        Register hj= leaveMapper.allRegistew(breakdown.getRegisterId());//查询病人的电话号
          Breakdown m=    new Breakdown();
          m.setRegisterId(breakdown.getRegisterId());//赋值住院号
          m.setRegisterPhone(hj.getRegisterPhone());//赋值电话
        return  breakdownMapper.allBreakdown(m);
    }
    ///患者信息
    public List<Register> allPar(Register register){

        return  breakdownMapper.allPar(register);
    }
    //护理床位记录查询
    public List<Hospitalcare>allHospitalcare(Register register){
        Register kk=   breakdownMapper.akkRegister(register);
        return breakdownMapper.allHospitalcare(kk.getRegisterId());
    }
    //查询医嘱扣费记录表
    public List<Prndebit>allPrndebit(Register register){
        Register kk=   breakdownMapper.akkRegister(register);
        return  breakdownMapper.allPrndebit(kk.getRegisterId());
    }
    //检验扣费查询
    public  List<InspectDebit>allInsectDebit(Register register){
        Register kk=   breakdownMapper.akkRegister(register);

        return  breakdownMapper.allInspectDebit(kk.getRegisterPhone());
    }
    //手术扣费记录表查询
    public List<Applyrecord>allApplyrecord(Register register){
        Register kk=  breakdownMapper.akkRegister(register);
        return breakdownMapper.allApplyrecord(kk.getRegisterId());
    }



}
