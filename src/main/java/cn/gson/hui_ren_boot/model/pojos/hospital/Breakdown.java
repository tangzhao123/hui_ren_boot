package cn.gson.hui_ren_boot.model.pojos.hospital;

import java.util.Date;

public class Breakdown {//接收各记录表里的数据
    private String   registerName;//患者住名
    private String   registerId;//患者住院号
    private String   breakName;//扣费项目
    private double  breakMoney ;//扣费金额


    public Breakdown() {
    }

    public Breakdown(String registerName, String registerId, String breakName, double breakMoney) {
        this.registerName = registerName;
        this.registerId = registerId;
        this.breakName = breakName;
        this.breakMoney = breakMoney;
    }

    public String getRegisterName() {
        return registerName;
    }

    public void setRegisterName(String registerName) {
        this.registerName = registerName;
    }

    public String getRegisterId() {
        return registerId;
    }

    public void setRegisterId(String registerId) {
        this.registerId = registerId;
    }

    public String getBreakName() {
        return breakName;
    }

    public void setBreakName(String breakName) {
        this.breakName = breakName;
    }

    public double getBreakMoney() {
        return breakMoney;
    }

    public void setBreakMoney(double breakMoney) {
        this.breakMoney = breakMoney;
    }

    @Override
    public String toString() {
        return "Breakdown{" +
                "registerName='" + registerName + '\'' +
                ", registerId='" + registerId + '\'' +
                ", breakName='" + breakName + '\'' +
                ", breakMoney=" + breakMoney +

                '}';
    }
}
