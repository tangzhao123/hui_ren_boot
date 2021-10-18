package cn.gson.hui_ren_boot.model.pojos.hospital;

import java.util.Date;

public class ChargeVo {
    private  double  prndebitSum;//扣费金额
    private  String  prndebitUser;//项目名
    private String   registerId;//住院号
    private  Date prndebitDate;//扣费时间
    private  String adviceId;//电话号码
    private  String registerName;//患者名
    private String projectName;//扣费类型

    public double getPrndebitSum() {
        return prndebitSum;
    }

    public void setPrndebitSum(double prndebitSum) {
        this.prndebitSum = prndebitSum;
    }

    public String getPrndebitUser() {
        return prndebitUser;
    }

    public void setPrndebitUser(String prndebitUser) {
        this.prndebitUser = prndebitUser;
    }

    public String getRegisterId() {
        return registerId;
    }

    public void setRegisterId(String registerId) {
        this.registerId = registerId;
    }

    public Date getPrndebitDate() {
        return prndebitDate;
    }

    public void setPrndebitDate(Date prndebitDate) {
        this.prndebitDate = prndebitDate;
    }

    public String getAdviceId() {
        return adviceId;
    }

    public void setAdviceId(String adviceId) {
        this.adviceId = adviceId;
    }

    public String getRegisterName() {
        return registerName;
    }

    public void setRegisterName(String registerName) {
        this.registerName = registerName;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
}
