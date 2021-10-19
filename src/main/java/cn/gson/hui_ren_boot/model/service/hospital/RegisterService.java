package cn.gson.hui_ren_boot.model.service.hospital;

import cn.gson.hui_ren_boot.model.mapper.hospital.RegisterMapper;
import cn.gson.hui_ren_boot.model.mapper.outpatient.TreatmentCardMapper;
import cn.gson.hui_ren_boot.model.pojos.hospital.Register;
import cn.gson.hui_ren_boot.model.pojos.outpatient.TreatmentCard;
import cn.gson.hui_ren_boot.model.pojos.outpatient.TreatmentRecharge;
import cn.gson.hui_ren_boot.model.pojos.permissions.Arrange;
import cn.gson.hui_ren_boot.model.pojos.permissions.Medical;
import cn.gson.hui_ren_boot.model.pojos.permissions.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class RegisterService {
    @Autowired
    RegisterMapper registerMapper;

    @Autowired
    TreatmentCardMapper treatmentCardMapper;
    public Object allRegisByPage(Integer pageNo, Integer size, Register inputboxs){
        return registerMapper.allRegis(inputboxs);
    }
    public Object allRegistByPage(Integer pageNo, Integer size, Register inputboxs){
        return registerMapper.allRegist(inputboxs);
    }
    public List<Register>allRegisw(Register inputboxs){
        return registerMapper.allRegist(inputboxs);
    }

    public void addRegister(Register ter){
        registerMapper.addRegister(ter);
    }

    public void addtreatmentCard(TreatmentCard tra){
        treatmentCardMapper.addCard(tra);
    }

    public Register allRegiMedical(String clinic,String id){//修改时查询诊疗卡
       return registerMapper.allRegiMedical(clinic,id);
    }

    public void upRegiste(Register k){//修改
        registerMapper.upRegister(k);
    }

    public  void upMajor(Register terx){//转科
        registerMapper.upMajor(terx);
    }

    public void reCharge(TreatmentRecharge p){//新增
        registerMapper.reCharge(p);
    }

    public TreatmentCard Recharge(String k){
        return registerMapper.selRecharge(k);//查询诊疗卡
    }

    public void upMedicalCard(TreatmentCard j){//充值
        registerMapper.upMedicalCard(j);
    }//充值修改诊疗卡金额

    public List<TreatmentRecharge> selseRecharge (String treatmentNo){//查询记录
        return registerMapper.selseRecharge(treatmentNo);
    }
//    排班查询
    public List<Arrange> chaArrange(Medical medical){
        List<Arrange>k=registerMapper.chaArrange(medical.getMedicalId());
        System.out.println(k);
        return k;
    }
    //    排班查询
    public List<Arrange> chaArrange2(Medical medical){
        Medical kl=registerMapper.allMedicals(medical.getMedicalName());
        List<Arrange>k=registerMapper.chaArrange(kl.getMedicalId());
        System.out.println(k);
        return k;
    }

    //不分页查询
    public List<Register>allR(Register register){
        return registerMapper.allR(register);
    }
    //床位查询
    public Register allRegister(String registerId){
      return registerMapper.allRegister(registerId);
    }
    //科室查询
    //医生站患者查询

    public List<Register>allRegist2(Register inputboxs){
        return registerMapper.allRegist2(inputboxs);
    }
}
