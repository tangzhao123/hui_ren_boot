package cn.gson.hui_ren_boot.controller.outpatient;

import cn.gson.hui_ren_boot.model.pojos.outpatient.*;
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
        String result="";
        String str = "SFXD";
        Random random=new Random();
        for(int i=0;i<3;i++){
            result+=random.nextInt(10);
        }
        return str+newDate+result;
    }

    @RequestMapping("/all-list")
    public List<PrescriptionList> allList(String outpatientCard){
        return paymentService.allList(outpatientCard);
    }

    @RequestMapping("/sel-list")
    public List<PrescriptionDetail> selList(String prescriptionNo){
        return paymentService.selNo(prescriptionNo);
    }

    //新增缴费记录
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

    //查询缴费记录
    @RequestMapping("/sel-payment")
    public Object selPayment(@RequestBody PaymentVo paymentVo){
        String start  = null;
        String end = null;
        if(paymentVo.getStart() != null && paymentVo.getEnd() != null){
            SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
            start = sf.format(paymentVo.getStart());
            end = sf.format(paymentVo.getEnd());
        }
        return paymentService.selPaymentByPage(paymentVo.getPageNo(), paymentVo.getSize(),start,end,paymentVo.getPaymentType(),paymentVo.getOutpatientName(),paymentVo.getStaffName());
    }

    //挂号时新增收费表
    @RequestMapping("/send-payment")
    public String sendPayment(@RequestBody PaymentForm payment){
        try{
            System.out.println(payment);
            paymentService.sendPayment(payment);
            return "ok";
        } catch (Exception e){
            e.printStackTrace();
            return "fail";
        }
    }

    //根据缴费号查询缴费详单
    @RequestMapping("/sel-payment-detail")
    public List<PaymentDetai> selPaymentDetail(String paymentNo){
        return paymentService.selPaymentDetail(paymentNo);
    }
}
