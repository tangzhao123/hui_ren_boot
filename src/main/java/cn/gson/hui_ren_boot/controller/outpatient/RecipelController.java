package cn.gson.hui_ren_boot.controller.outpatient;

import cn.gson.hui_ren_boot.model.pojos.medical.Comboitem;
import cn.gson.hui_ren_boot.model.pojos.outpatient.PrescriptionDetail;
import cn.gson.hui_ren_boot.model.pojos.outpatient.PrescriptionList;
import cn.gson.hui_ren_boot.model.pojos.outpatient.RowNumbers;
import cn.gson.hui_ren_boot.model.pojos.outpatient.TestItems;
import cn.gson.hui_ren_boot.model.pojos.pharmacy.DrugInfo;
import cn.gson.hui_ren_boot.model.service.outpatient.RecipelService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
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

    //查询药品
    @RequestMapping("/all-drug")
    public List<DrugInfo> allDrug(String drugInfo){
        DrugInfo drugInfos = JSONObject.toJavaObject(JSON.parseObject(drugInfo), DrugInfo.class);
        return recipelService.allDrug(drugInfos);
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

    //新增门诊中药处方单和处方详单
    @RequestMapping("/add-recipelChinese")
    public String addChineseRecipel(@RequestBody PrescriptionList prescriptionList){
        try{
            List<PrescriptionDetail> detail = prescriptionList.getDetails();
            for (PrescriptionDetail details : detail) {
                details.setRecipelNo(getOrderIdByTime());
            }
            System.out.println(prescriptionList);
            recipelService.recipelChinese(prescriptionList, prescriptionList.getDetails());
            return "ok";
        } catch (Exception e){
            e.printStackTrace();
            return "fail";
        }
    }

    //查询门诊西药处方单
    @RequestMapping("/all-recipel")
    public List<PrescriptionList> allRecipel(@RequestBody PrescriptionList prescriptionList){
        return recipelService.allRecipel(prescriptionList);
    }

    //根据处方号查询处方详单
    @RequestMapping("/sel-no")
    public List<PrescriptionDetail> selNo(String prescriptionNo){
        System.out.println(prescriptionNo);
        return recipelService.selNo(prescriptionNo);
    }

    //查询排号
    @RequestMapping("/all-number")
    public List<RowNumbers> allNumber(int medicalId,int staffId,int rankId){
        return recipelService.allNumber(medicalId, staffId,rankId);
    }

    //过号，根据挂号单修改id为最后一位
    @RequestMapping("/edit-row")
    public void editRow(String bookingNo){
        recipelService.editRow(bookingNo);
    }

    //查询检验项目
    @RequestMapping("/all-com")
    public List<Comboitem> allCom(String itemName){
        return recipelService.allCom(itemName);
    }

    //开检验项目和新增检验项目详单
    @RequestMapping("/add-items")
    public String addItems(@RequestBody TestItems testItems){
        try{
            System.out.println(testItems);
            recipelService.addItems(testItems, testItems.getComboitems());
            return "ok";
        } catch (Exception e){
            e.printStackTrace();
            return "fail";
        }
    }
}
