package cn.gson.hui_ren_boot.model.mapper.drug;

import cn.gson.hui_ren_boot.model.pojos.outpatient.PaymentForm;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PaymentFormsMapper {

    //查询每月的销售额
    public List<PaymentForm> allPaymentForm();

    //查询上月的销售额
    public List<PaymentForm> allPayment();

//    //查询收费总金额
//    public double allPaymentMoneys();
//
//    //查询用户数量
//    public int allStaffSum();
//
//    //查询药品数量
//    public int allStockSurplus();
//
//    //查询出库数量
//    public int allStockoutAmount();
//
//    //查询入库数量
//    public int allDetailNumber();

}
