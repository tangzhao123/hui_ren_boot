package cn.gson.hui_ren_boot.model.service.hospital;

import cn.gson.hui_ren_boot.model.mapper.hospital.RegisterDao;
import cn.gson.hui_ren_boot.model.mapper.hospital.RegisterMapper;
import cn.gson.hui_ren_boot.model.mapper.outpatient.TreatmentCardMapper;
import cn.gson.hui_ren_boot.model.pojos.hospital.Register;
import cn.gson.hui_ren_boot.model.pojos.outpatient.OutpatientRegister;
import cn.gson.hui_ren_boot.model.pojos.outpatient.TreatmentCard;
import cn.gson.hui_ren_boot.model.pojos.outpatient.TreatmentRecharge;
import org.junit.validator.PublicClassValidator;
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
    RegisterDao registerDao;
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
    public void saveRegis(Register j){
        registerDao.save(j);
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
    }
    public List<TreatmentRecharge> selseRecharge (String treatmentNo){//查询记录
        return registerMapper.selseRecharge(treatmentNo);
    }
}
