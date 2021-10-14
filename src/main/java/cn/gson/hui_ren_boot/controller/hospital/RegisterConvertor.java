package cn.gson.hui_ren_boot.controller.hospital;

import cn.gson.hui_ren_boot.model.pojos.hospital.Hospital;
import cn.gson.hui_ren_boot.model.pojos.hospital.Register;
import cn.gson.hui_ren_boot.model.pojos.outpatient.TreatmentCard;
import cn.gson.hui_ren_boot.model.pojos.outpatient.TreatmentRecharge;
import cn.gson.hui_ren_boot.model.pojos.permissions.Arrange;
import cn.gson.hui_ren_boot.model.pojos.permissions.Medical;
import cn.gson.hui_ren_boot.model.service.hospital.HospialService;
import cn.gson.hui_ren_boot.model.service.hospital.RegisterService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/PatientRegistration")
public class RegisterConvertor {
    @Autowired
    RegisterService registerService;
    @Autowired
    HospialService hospialService;
    //病人信息多条件分页查询患者信息
    @RequestMapping("/registers")
    public Object allregis(Integer pageNo, Integer size, String shu) {
        // Register inputboxs = JSONObject.toJavaObject(JSON.parseObject(inputbox),Register.class);
        Register inputboxs = JSONObject.toJavaObject(JSON.parseObject(shu), Register.class);

        return registerService.allRegisByPage(pageNo, size, inputboxs);
    }
    @RequestMapping("/registerst")//缴费表
    public Object allregist(Integer pageNo, Integer size, String shu) {
        // Register inputboxs = JSONObject.toJavaObject(JSON.parseObject(inputbox),Register.class);
        Register inputboxs = JSONObject.toJavaObject(JSON.parseObject(shu), Register.class);
        return registerService.allRegistByPage(pageNo, size, inputboxs);
    }
    @RequestMapping("/registersw")//医生患者表
    public List<Register>allregistw(String shu){

        Register inputboxs = JSONObject.toJavaObject(JSON.parseObject(shu), Register.class);
        return registerService.allRegisw(inputboxs);
     }
    //新增住院病人信息
    @RequestMapping("/saveRegis")
    public String saveRegis(@RequestBody Register j) {
        System.out.println(j);

       try {
           if( Thequery(j)==true){//如果为空就新增
               TreatmentCard ya=new TreatmentCard();
               ya.setTreatmentNo(j.getRegisterClinic());//就诊卡号
               ya.setTreatmentName(j.getRegisterName());//姓名
               String k = j.getRegisterHome();
               String result = k.substring(k.length()-4,k.length());//截取身份证后四位数
               ya.setTreatmentPassword("123456"+result);//密码
               ya.setTreatmentCard(j.getRegisterHome());//身份
               ya.setTreatmentBalance(0L);//金额
               registerService.addtreatmentCard(ya);//新增就诊卡
               registerService.addRegister(j);//新增病人信息
               Hospital hj=new Hospital();
               hj.setHospitalCard(j.getRegisterHome());
               System.out.println(j.getRegisterHome());
               hj.setHospitalState(1);
               hospialService.upHostpState(hj);//修改申请表状态
               return "ok";//新增成功
           }else {//不为空就修改
               registerService.upRegiste(j);
               return "ok2";//修改成功

           }
        } catch (Exception e) {
            e.printStackTrace();
            return "fail";
        }
    }
    public boolean Thequery(Register j){//查询数据里是否有就诊号与诊疗卡
        Register k=    registerService.allRegiMedical(j.getRegisterClinic(), j.getRegisterId());
        if (k==null){
            return true;
        }else{
            return false;
        }
    }
    @RequestMapping("/upRecharge")
    public String upRecharge(@RequestBody TreatmentCard k){
        try{
            TreatmentCard lj= registerService.Recharge(k.getTreatmentNo());//查询诊疗卡
            System.out.println(lj.getTreatmentBalance());
            TreatmentRecharge p=new TreatmentRecharge();//新增记录
            p.setRechargeMoney(k.getTreatmentBalance());
            p.setTreatmentNo(k.getTreatmentNo());
            registerService.reCharge(p);

            long ljBalance= lj.getTreatmentBalance()+k.getTreatmentBalance();//金额累加
            k.setTreatmentBalance(ljBalance);//累加赋值
            registerService.upMedicalCard(k);//修改金额
            //————————————————————————


            return "ok";
        }catch (Exception e){
            return "fail";
        }
    }
//    @RequestMapping("/selseRecords")
//    public Object allRecords(@RequestBody Integer pageNo, Integer size, TreatmentRecharge treatmentNo){//查询记录
//        System.out.println(treatmentNo.getTreatmentNo());
//
//      return   registerService.selseRechargeByPage(pageNo,size,treatmentNo);
//    }
    @RequestMapping("/selseRecords")
    public List<TreatmentRecharge> allRecords(String treatmentNo){//查询记录
        System.out.println(treatmentNo);

        return   registerService.selseRecharge(treatmentNo);
    }
    @RequestMapping("/upMajor")
    public  String upMajor(@RequestBody Register lk){//修改病人信息

        System.out.println(lk);
        try {
            registerService.upMajor(lk);
            return "ok";
        }catch (Exception e){
            return "fail";
        }
    }//    排班查询
    @RequestMapping("arrenge")
    public List<Arrange>chaArrange(@RequestBody Medical medical){//查询排班表
      return   registerService.chaArrange(medical);
    }
    @RequestMapping("arrenge2")
    public List<Arrange>chaArrange2(@RequestBody Medical medical){//查询排班表
        return   registerService.chaArrange2(medical);
    }
}