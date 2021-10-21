package cn.gson.hui_ren_boot.model.mapper.drug;

import cn.gson.hui_ren_boot.model.pojos.hospital.Details;
import cn.gson.hui_ren_boot.model.pojos.nursestation.Orders;
import cn.gson.hui_ren_boot.model.pojos.outpatient.PaymentDetai;
import cn.gson.hui_ren_boot.model.pojos.outpatient.PaymentForm;
import cn.gson.hui_ren_boot.model.pojos.outpatient.PrescriptionDetail;
import cn.gson.hui_ren_boot.model.pojos.outpatient.PrescriptionList;
import cn.gson.hui_ren_boot.model.pojos.pharmacy.DrugInfoVo;
import cn.gson.hui_ren_boot.model.pojos.pharmacy.SendDrug;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SendDrugMapper {

    //根据处方单号查询处方单
    public List<PrescriptionList> findAllPrescriptionList(List<String> prescriptionNo);


    //根据处方单号查询处方详单
    public List<PrescriptionDetail> findAllPrescriptionDetail(String prescriptionNo);

    //根据处方单号查询处方详单
    public List<PrescriptionDetail> findPrescriptionDetail(List<String> prescriptionNo);

    //查询所有的缴费记录表
    public List<PaymentForm> findAllPaymentForm(String recordNo);

    //根据缴费记录单号查询缴费详单
    public List<PaymentDetai> findAllPaymentDetail(List<String> paymentNo);

    //查询处方单有没有发药记录
    public List<SendDrug> findAllSendDrug(List<String> prescriptionNo);

    //新增发药单
    public void addSendDrug(SendDrug sendDrug);

    //根据处方单号的药品编号修改药房库存数量
    public void updatePharmacyDetail(@Param("doseSum") Long doseSum,@Param("detailBatch") String detailBatch);


    //医嘱发药的查询
    public List<Orders> findAllOrders(@Param("date") String date,@Param("date1") String date1,@Param("medicalId") Long medicalId );

    //根据住院号查询已经执行的医嘱
    public List<Details> allDetails(String registerId);

    //根据医嘱号查询医嘱详情
    public List<Details> findAllDetails(List<String> adviceId);

    //查询药品规格
    public List<DrugInfoVo> allDrug();
}
