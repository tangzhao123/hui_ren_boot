package cn.gson.hui_ren_boot.model.service.outpatient;

import cn.gson.hui_ren_boot.model.mapper.outpatient.PaymentDetaiMapper;
import cn.gson.hui_ren_boot.model.mapper.outpatient.PaymentFormMapper;
import cn.gson.hui_ren_boot.model.mapper.outpatient.PrescriptionDetailMapper;
import cn.gson.hui_ren_boot.model.mapper.outpatient.PrescriptionListMapper;
import cn.gson.hui_ren_boot.model.pojos.outpatient.PaymentForm;
import cn.gson.hui_ren_boot.model.pojos.outpatient.PrescriptionDetail;
import cn.gson.hui_ren_boot.model.pojos.outpatient.PrescriptionList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {
    @Autowired
    PrescriptionListMapper listMapper;
    @Autowired
    PrescriptionDetailMapper detailMapper;
    @Autowired
    PaymentFormMapper paymentFormMapper;
    @Autowired
    PaymentDetaiMapper paymentDetaiMapper;

    //收费，查询处方单
    public List<PrescriptionList> allList(String recordsNo){
        return listMapper.allList(recordsNo);
    }

    //根据处方号查询详单
    public List<PrescriptionDetail> selNo(String prescriptionNo){
        return detailMapper.selNo(prescriptionNo);
    }

    //新增缴费单和缴费详单
    public void addPayment(PaymentForm paymentForm,List<PrescriptionDetail> prescriptionDetails){
        paymentFormMapper.addPayment(paymentForm);
        paymentDetaiMapper.addPaymentDetail(prescriptionDetails, paymentForm.getPaymentNo());
    }

}
