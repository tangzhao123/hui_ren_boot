package cn.gson.hui_ren_boot.model.pojos.permissions;

import java.sql.Time;

//查询月销售额的VO类
public class PaymentFormVo {

    private double paymentMoney;
    private String paymentTime;

    public double getPaymentMoney() {
        return paymentMoney;
    }

    public void setPaymentMoney(double paymentMoney) {
        this.paymentMoney = paymentMoney;
    }

    public String getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(String paymentTime) {
        this.paymentTime = paymentTime;
    }
}
