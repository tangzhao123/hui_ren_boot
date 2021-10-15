package cn.gson.hui_ren_boot.model.pojos.permissions;

import java.sql.Time;

//查询月销售额的VO类
public class PaymentFormVo {

    private double hospitalcareMoney;
    private String hospitalcareDate;

    public double getHospitalcareMoney() {
        return hospitalcareMoney;
    }

    public void setHospitalcareMoney(double hospitalcareMoney) {
        this.hospitalcareMoney = hospitalcareMoney;
    }

    public String getHospitalcareDate() {
        return hospitalcareDate;
    }

    public void setHospitalcareDate(String hospitalcareDate) {
        this.hospitalcareDate = hospitalcareDate;
    }
}
