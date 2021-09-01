package cn.gson.hui_ren_boot.controller.outpatient;

import cn.gson.hui_ren_boot.model.pojos.outpatient.PaymentForm;
import cn.gson.hui_ren_boot.model.pojos.outpatient.PrescriptionDetail;
import cn.gson.hui_ren_boot.model.pojos.outpatient.PrescriptionList;
import cn.gson.hui_ren_boot.model.service.outpatient.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * 收费
 */
@RestController
@RequestMapping("/outpatient")
public class PaymentController {
    @Autowired
    PaymentService paymentService;

    //生成缴费详单号
    public static String getOrderIdByTime() {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmss");
        String newDate=sdf.format(new Date());
        String result="SFXD";
        Random random=new Random();
        for(int i=0;i<3;i++){
            result+=random.nextInt(10);
        }
        return newDate+result;
    }

    @RequestMapping("/all-list")
    public List<PrescriptionList> allList(String recordNo){
        return paymentService.allList(recordNo);
    }

    @RequestMapping("/sel-list")
    public List<PrescriptionDetail> selList(String prescriptionNo){
        return paymentService.selNo(prescriptionNo);
    }

    @RequestMapping("/add-payment")
    public String addPayment(@RequestBody PaymentForm payment){
        try{
            System.out.println(payment);
            List<PrescriptionDetail> list = payment.getPrescriptionDetails();
            for (PrescriptionDetail p : list) {
                p.setDetailNo(getOrderIdByTime());
            }
            paymentService.addPayment(payment,payment.getPrescriptionDetails());
            return "ok";
        } catch (Exception e){
            e.printStackTrace();
            return "fail";
        }
    }
}
