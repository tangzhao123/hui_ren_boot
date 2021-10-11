package cn.gson.hui_ren_boot.controller.pharmacy;

import cn.gson.hui_ren_boot.model.pojos.pharmacy.DrugInfo;
import cn.gson.hui_ren_boot.model.service.pharmacy.DrugService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/druginfo")
public class DruginfoController {
    @Autowired
    DrugService drugService;
//分页查询处方选药
    @RequestMapping("/drugmanger")
    public Object allDrug(Integer pageNo,Integer size,String manage){
        System.out.println(manage);
        DrugInfo drugInfos = JSONObject.toJavaObject(JSON.parseObject(manage), DrugInfo.class);
        System.out.println(drugInfos);
        return drugService.allDrugByPage(pageNo,size,drugInfos);
    }
    //新增
   @RequestMapping("/adddrug")
   public String addDrug(@RequestBody DrugInfo drugInfo){
       System.out.println(drugInfo.getDrugId());
        if(drugInfo.getDrugSerial()==null){//新增
            System.out.println(11111);
            drugService.addDrug(drugInfo);
            return "ok";
        }else {//修改
            System.out.println(22222);
            drugService.upMange(drugInfo);
            return "ok2";
        }
    }
    //修改药品状态
    @RequestMapping("/upstate")
    public String allState(@RequestBody  DrugInfo drugInfow){
        try{

            drugInfow.setDrugState(1L);
            drugService.allState(drugInfow);
            return "ok";
        }catch (Exception e){
            e.printStackTrace();
            return "fail";
        }

    }

}
