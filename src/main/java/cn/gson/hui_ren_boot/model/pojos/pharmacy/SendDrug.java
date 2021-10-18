package cn.gson.hui_ren_boot.model.pojos.pharmacy;


import cn.gson.hui_ren_boot.model.pojos.permissions.UserInfo;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "SEND_DRUG", schema = "HUIREN")
public class SendDrug {

    private long sendId;
    private String sendNum;
    private Timestamp sendDate;
    private Long sendDrug;
    private Double sendPrice;
    private Long sendPeople;
    private String prescriptionNo;
    private List<Dose> doses;
    private Pharmacy pharmacys;
    private UserInfo userInfos;
    private Integer pageNo;
    private Integer size;
    private String drugName;

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    @OneToOne
    public Pharmacy getPharmacys() {
        return pharmacys;
    }

    public void setPharmacys(Pharmacy pharmacys) {
        this.pharmacys = pharmacys;
    }

    @OneToOne
    public UserInfo getUserInfos() {
        return userInfos;
    }

    public void setUserInfos(UserInfo userInfos) {
        this.userInfos = userInfos;
    }

    @Id
    @Column(name = "SEND_ID")
    public long getSendId() {
        return sendId;
    }

    public void setSendId(long sendId) {
        this.sendId = sendId;
    }

    @Basic
    @Column(name = "SEND_NUM")
    public String getSendNum() {
        return sendNum;
    }

    public void setSendNum(String sendNum) {
        this.sendNum = sendNum;
    }

    @Basic
    @Column(name = "SEND_DATE")
    public Timestamp getSendDate() {
        return sendDate;
    }

    public void setSendDate(Timestamp sendDate) {
        this.sendDate = sendDate;
    }

    @Basic
    @Column(name = "SEND_DRUG")
    public Long getSendDrug() {
        return sendDrug;
    }

    public void setSendDrug(Long sendDrug) {
        this.sendDrug = sendDrug;
    }

    @Basic
    @Column(name = "SEND_PRICE")
    public Double getSendPrice() {
        return sendPrice;
    }

    public void setSendPrice(Double sendPrice) {
        this.sendPrice = sendPrice;
    }

    @Basic
    @Column(name = "SEND_PEOPLE")
    public Long getSendPeople() {
        return sendPeople;
    }

    public void setSendPeople(Long sendPeople) {
        this.sendPeople = sendPeople;
    }

    @Basic
    @Column(name = "PRESCRIPTION_NO")
    public String getPrescriptionNo() {
        return prescriptionNo;
    }

    public void setPrescriptionNo(String prescriptionNo) {
        this.prescriptionNo = prescriptionNo;
    }

    @OneToMany
    public List<Dose> getDoses() {
        return doses;
    }

    public void setDoses(List<Dose> doses) {
        this.doses = doses;
    }

    public SendDrug() {
    }

    public SendDrug(String sendNum, Long sendDrug, Double sendPrice, Long sendPeople, String prescriptionNo) {
        this.sendNum = sendNum;
        this.sendDrug = sendDrug;
        this.sendPrice = sendPrice;
        this.sendPeople = sendPeople;
        this.prescriptionNo = prescriptionNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SendDrug sendDrug1 = (SendDrug) o;
        return sendId == sendDrug1.sendId && Objects.equals(sendNum, sendDrug1.sendNum) && Objects.equals(sendDate, sendDrug1.sendDate) && Objects.equals(sendDrug, sendDrug1.sendDrug) && Objects.equals(sendPrice, sendDrug1.sendPrice) && Objects.equals(sendPeople, sendDrug1.sendPeople) && Objects.equals(prescriptionNo, sendDrug1.prescriptionNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sendId, sendNum, sendDate, sendDrug, sendPrice, sendPeople, prescriptionNo);
    }

    @Override
    public String toString() {
        return "SendDrug{" +
                "sendId=" + sendId +
                ", sendNum='" + sendNum + '\'' +
                ", sendDate=" + sendDate +
                ", sendDrug=" + sendDrug +
                ", sendPrice=" + sendPrice +
                ", sendPeople=" + sendPeople +
                ", prescriptionNo='" + prescriptionNo + '\'' +
                ", doses=" + doses +
                '}';
    }
}
