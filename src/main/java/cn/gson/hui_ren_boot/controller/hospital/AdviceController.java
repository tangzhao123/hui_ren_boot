package cn.gson.hui_ren_boot.controller.hospital;

import cn.gson.hui_ren_boot.model.pojos.hospital.Advice;
import cn.gson.hui_ren_boot.model.pojos.hospital.Details;
import cn.gson.hui_ren_boot.model.pojos.hospital.Register;
import cn.gson.hui_ren_boot.model.service.hospital.AdviceService;
import cn.gson.hui_ren_boot.utils.MyUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/DrugDispensing")
public class AdviceController {
    @Autowired
    AdviceService adviceService;
    @RequestMapping("/dispensing")
    public List<Advice> allDispensing(){
        return  adviceService.allDispensing();
    }
    @RequestMapping("/addAdvices")
    public String addAdvice(@RequestBody Advice advice){//医嘱主表
        System.out.println(advice);
      try{
//            double price=0;//单价
            List<Details>detail=advice.getDetailst();

            for (Details p:detail) {
                String danhao=  MyUtil.genrateNo("YZXD");//订单编号
                System.out.println(danhao);
                p.setDaralisStart(advice.getAdviceStart());//开始时间
                p.setDaralisDisable(advice.getAdviceEnd());
                p.setAdviceId(advice.getAdviceId());//医嘱号
                p.setDaralisDstate(1L);
                p.setDaralisMark(danhao);
                System.out.println(p.getDetailsDrip());
                if(p.getDetailsDrip()==null){
                    p.setDetailsDrip("null");
                }


          }
          adviceService.addAdvices(advice,detail);

            return "ok";
        }catch(Exception e){
            return "fail";
        }
    }
    @RequestMapping("/seletAdvicvt")//医嘱管理
    public Object  seletAdvicvt(Integer pageNo, Integer size,String shu){
        Advice inputboxs = JSONObject.toJavaObject(JSON.parseObject(shu), Advice.class);

        return adviceService.selectAdviceByPage(pageNo,size,inputboxs);
    }
}
