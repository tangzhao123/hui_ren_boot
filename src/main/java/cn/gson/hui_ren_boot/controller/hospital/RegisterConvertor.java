package cn.gson.hui_ren_boot.controller.hospital;

import cn.gson.hui_ren_boot.model.pojos.hospital.Register;
import cn.gson.hui_ren_boot.model.pojos.outpatient.TreatmentCard;
import cn.gson.hui_ren_boot.model.service.hospital.RegisterService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/PatientRegistration")
public class RegisterConvertor {
    @Autowired
    RegisterService registerService;

    //多条件分页查询患者信息
    @RequestMapping("/registers")
    public Object allregis(Integer pageNo, Integer size, String shu) {
        // Register inputboxs = JSONObject.toJavaObject(JSON.parseObject(inputbox),Register.class);
        Register inputboxs = JSONObject.toJavaObject(JSON.parseObject(shu), Register.class);
        System.out.println("数据" + inputboxs);
        return registerService.allRegisByPage(pageNo, size, inputboxs);
    }//新增住院病人信息
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
               return "ok";//新增成功
           }else {//不为空就修改
               return "ok2";//修改失败
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
}