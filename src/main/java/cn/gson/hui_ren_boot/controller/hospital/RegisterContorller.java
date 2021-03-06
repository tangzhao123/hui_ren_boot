package cn.gson.hui_ren_boot.controller.hospital;

import cn.gson.hui_ren_boot.model.pojos.hospital.Hospital;
import cn.gson.hui_ren_boot.model.pojos.hospital.Register;
import cn.gson.hui_ren_boot.model.pojos.outpatient.TreatmentCard;
import cn.gson.hui_ren_boot.model.pojos.outpatient.TreatmentRecharge;
import cn.gson.hui_ren_boot.model.pojos.permissions.Arrange;
import cn.gson.hui_ren_boot.model.pojos.permissions.Medical;
import cn.gson.hui_ren_boot.model.pojos.permissions.Staff;
import cn.gson.hui_ren_boot.model.service.hospital.HospialService;
import cn.gson.hui_ren_boot.model.service.hospital.RegisterService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Field;
import java.util.List;

@RestController
@RequestMapping("/PatientRegistration")
public class RegisterContorller {
    @Autowired
    RegisterService registerService;
    @Autowired
    HospialService hospialService;

    public static boolean checkObjFieldIsNotNull(Object obj) {   // true 不为空  false 为空
        boolean flag = false;
        try {
            for (Field f : obj.getClass().getDeclaredFields()) {
                f.setAccessible(true);
                if (f.get(obj) == null || f.get(obj) == "") {
                } else {
                    flag = true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return flag;
    }
    //病人信息多条件分页查询患者信息
    @RequestMapping("/registers")
    public Object allregis( Integer pageNo, Integer size,String shu) {
        // Register inputboxs = JSONObject.toJavaObject(JSON.parseObject(inputbox),Register.class);
        Register inputboxs = JSONObject.toJavaObject(JSON.parseObject(shu), Register.class);

        return registerService.allRegisByPage(pageNo, size,inputboxs);
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
        return registerService.allRegist2(inputboxs);
     }
    //新增住院病人信息
    @RequestMapping("/saveRegis")
    public String saveRegis(@RequestBody Register j) {


       try {
           if( Thequery(j)==true){//如果为空就新增
                TreatmentCard card=  registerService.Recharge(j.getRegisterClinic());
               System.err.println(checkObjFieldIsNotNull(card));
                if(checkObjFieldIsNotNull(card)==true){
                    registerService.addRegister(j);//新增病人信息

                    Hospital hj=new Hospital();
                    hj.setHospitalCard(j.getRegisterHome());
                    System.out.println(j.getRegisterHome());
                    hj.setHospitalState(1);
                    hospialService.upHostpState(hj);//修改申请表状态
                }else{
                    TreatmentCard ya=new TreatmentCard();
                    ya.setTreatmentNo(j.getRegisterClinic());//就诊卡号
                    ya.setTreatmentName(j.getRegisterName());//姓名
                    String k = j.getRegisterHome();
                    String result = k.substring(k.length()-4,k.length());//截取身份证后四位数
                    ya.setTreatmentPassword("123456"+result);//密码
                    ya.setTreatmentCard(j.getRegisterHome());//身份
                    ya.setTreatmentBalance(0);//金额
                    registerService.addtreatmentCard(ya);//新增就诊卡

                    registerService.addRegister(j);//新增病人信息

                    Hospital hj=new Hospital();
                    hj.setHospitalCard(j.getRegisterHome());
                    System.out.println(j.getRegisterHome());
                    hj.setHospitalState(1);
                    hospialService.upHostpState(hj);//修改申请表状态
                }



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
    @RequestMapping("/upRecharge")//修改诊疗卡金额
    public String upRecharge(@RequestBody TreatmentCard treatmentCard){

       try{


            TreatmentRecharge p=new TreatmentRecharge();//新增记录
            p.setRechargeMoney(treatmentCard.getTreatmentBalance());
            p.setTreatmentNo(treatmentCard.getTreatmentNo());
            System.err.println(123);
            registerService.reCharge(p);//新增记录

            registerService.upMedicalCard(treatmentCard);//修改金额
            //————————————————————————


            return "ok";
        }catch (Exception e){
            return "fail";
        }
    }

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