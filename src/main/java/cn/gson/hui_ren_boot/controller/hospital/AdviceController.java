package cn.gson.hui_ren_boot.controller.hospital;

import cn.gson.hui_ren_boot.model.pojos.hospital.Advice;
import cn.gson.hui_ren_boot.model.pojos.hospital.Casefile;
import cn.gson.hui_ren_boot.model.pojos.hospital.Details;
import cn.gson.hui_ren_boot.model.service.hospital.AdviceService;
import cn.gson.hui_ren_boot.model.service.hospital.CasefileService;
import cn.gson.hui_ren_boot.utils.MyUtil;
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
    @Autowired
    CasefileService casefileService;
    @RequestMapping("/dispensing")
    public List<Advice> allDispensing(){
        return  adviceService.allDispensing();
    }
    @RequestMapping("/addAdvices")
    public String addAdvice(@RequestBody Advice advice){//医嘱主表新增

//      try{

          List<Casefile> zy= casefileService.allCasefile(advice.getAdviceId());
            double price=0;//单价
            if(zy.isEmpty()){
               return "ok2";
            }else{
                List<Details>detail=advice.getDetails();

                for (Details p:detail) {
                    String danhao=  MyUtil.genrateNo("YZXD");//订单编号
                    System.out.println(danhao);
                    p.setDaralisStart(advice.getAdviceStart());//开始时间
                    p.setDaralisDisable(advice.getAdviceEnd());
                    p.setAdviceId(advice.getAdviceId());//医嘱号
                    p.setRegisterId(advice.getRegisterId());
                    p.setDaralisDstate(1L);
                    p.setDaralisMark(danhao);
                    System.out.println(p.getDetailsDrip());
                }
                adviceService.addAdvices(advice,detail);
                return "ok";
            }



//
//       }catch(Exception e){
//           return "fail";
//       }
    }
    @RequestMapping("/seletAdvicvt")//医嘱管理
    public List<Advice>  seletAdvicvt(@RequestBody Advice advice){


        return adviceService.selectAdvice(advice);
    }
}
