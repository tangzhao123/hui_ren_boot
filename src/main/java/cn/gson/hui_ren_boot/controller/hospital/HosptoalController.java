package cn.gson.hui_ren_boot.controller.hospital;

import cn.gson.hui_ren_boot.model.pojos.hospital.Hospital;
import cn.gson.hui_ren_boot.model.service.hospital.HospialService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/Hosptoals")
public class HosptoalController {
    @Autowired
    HospialService hospialService;
    @RequestMapping("/saveg")
    public String saveHospoal(@RequestBody Hospital p){//新增住院申请表
        try {

            if(judgeToBeRepeated(p)==false){//身份证判断重复
                return"fail2";//返回前台身份证重复
            }else{
               if(judgmentIsEmpty(p)==true){//修改
                   hospialService.upHostp(p);
                   return"ok2";//返回前台修改成功
               }else{//新增
//                   p.setHospitalDate(new Date());
                   p.setHospitalState(0);
                   hospialService.addHostp(p);

                   return"ok";//新增成功
               }

            }
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(1);
            return"fail";//异常判断新增失败
        }


    }
    public boolean judgeToBeRepeated(Hospital p){//判断身份证重复
        Hospital   spat=  hospialService.allspital(p.getHospitalCard());//查询身份证重复
          if(spat!=null){
              return false;
          }else{
              return true;
          }

    }
    public boolean judgmentIsEmpty(Hospital p){//判断申请表是否新增和修改
        if(p.getHospitalId()>0){
            return true;
        }else{
            return false;
        }
    }
    @RequestMapping("/allHospt")//查询分页
    public Object allHopsts(Integer pageNo, Integer size,String shuk){
        Hospital hop= JSONObject.toJavaObject(JSON.parseObject(shuk),Hospital.class);
        return hospialService.allhosptialByPage(pageNo,size,hop);
    }
    @RequestMapping("/deHospot")//删除
    public String deHopspot(Integer hospitalId){
        System.out.println(hospitalId);
        try{
            hospialService.deHostp(hospitalId);
            return "ok";
        }catch (Exception e){
            e.printStackTrace();
            return "fail";

        }
    }
}
