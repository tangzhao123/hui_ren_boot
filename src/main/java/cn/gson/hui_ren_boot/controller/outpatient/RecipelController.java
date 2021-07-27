package cn.gson.hui_ren_boot.controller.outpatient;

import cn.gson.hui_ren_boot.model.pojos.outpatient.PrescriptionDetail;
import cn.gson.hui_ren_boot.model.pojos.outpatient.PrescriptionList;
import cn.gson.hui_ren_boot.model.pojos.pharmacy.PlanDetails;
import cn.gson.hui_ren_boot.model.service.outpatient.RecipelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * 门诊开处方
 */
@RestController
@RequestMapping("/outpatient")
public class RecipelController {
    @Autowired
    RecipelService recipelService;

    //生成处方详单号
    public static String getOrderIdByTime() {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmss");
        String newDate=sdf.format(new Date());
        String result="CF";
        Random random=new Random();
        for(int i=0;i<3;i++){
            result+=random.nextInt(10);
        }
        return newDate+result;
    }

    //新增门诊西药处方单和处方详单
    @RequestMapping("/add-recipel")
    public String addRecipel(@RequestBody PrescriptionList prescriptionList){
        try{
            List<PrescriptionDetail> detail = prescriptionList.getDetails();
            for (PrescriptionDetail details : detail) {

                details.setRecipelNo(getOrderIdByTime());
            }
            System.out.println(prescriptionList);
            recipelService.recipel(prescriptionList, prescriptionList.getDetails());
            return "ok";
        } catch (Exception e){
            e.printStackTrace();
            return "fail";
        }
    }

    //查询门诊西药处方单
    @RequestMapping("/all-recipel")
    public List<PrescriptionList> allRecipel(){
        return recipelService.allRecipel();
    }

    //根据处方号查询处方详单
    @RequestMapping("/sel-no")
    public List<PrescriptionDetail> selNo(String prescriptionNo){
        System.out.println(prescriptionNo);
        return recipelService.selNo(prescriptionNo);
    }
}
