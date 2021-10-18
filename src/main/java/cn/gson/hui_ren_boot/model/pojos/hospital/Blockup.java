package cn.gson.hui_ren_boot.model.pojos.hospital;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Blockup {
    private long blockupSeriald;//序号
    private String detailsMark;//详单号
    private Timestamp blockupDate;//时间
    private String staffName;//医生名
    private String registerId;//住院号
    private String blockupWhy;//停医原因
    private String adviceId;//医嘱号

    @Id
    @SequenceGenerator(sequenceName = "seq_huiren",name = "seq",allocationSize = 1,initialValue = 1)
    @GeneratedValue(generator = "seq",strategy = GenerationType.SEQUENCE)
    @Column(name = "BLOCKUP_SERIALD")
    public long getBlockupSeriald() {
        return blockupSeriald;
    }

    public void setBlockupSeriald(long blockupSeriald) {
        this.blockupSeriald = blockupSeriald;
    }
    @Basic
    @Column(name = "ADVICE_ID")
    public String getAdviceId() {
        return adviceId;
    }

    public void setAdviceId(String adviceId) {
        this.adviceId = adviceId;
    }

    @Basic
    @Column(name = "DETAILS_MARK")
    public String getDetailsMark() {
        return detailsMark;
    }

    public void setDetailsMark(String detailsMark) {
        this.detailsMark = detailsMark;
    }

    @Basic
    @Column(name = "BLOCKUP_DATE")
    public Timestamp getBlockupDate() {
        return blockupDate;
    }

    public void setBlockupDate(Timestamp blockupDate) {
        this.blockupDate = blockupDate;
    }

    @Basic
    @Column(name = "STAFF_NAME")
    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    @Basic
    @Column(name = "REGISTER_ID")
    public String getRegisterId() {
        return registerId;
    }

    public void setRegisterId(String registerId) {
        this.registerId = registerId;
    }

    @Basic
    @Column(name = "BLOCKUP_WHY")
    public String getBlockupWhy() {
        return blockupWhy;
    }

    public void setBlockupWhy(String blockupWhy) {
        this.blockupWhy = blockupWhy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Blockup blockup = (Blockup) o;
        return blockupSeriald == blockup.blockupSeriald && Objects.equals(detailsMark, blockup.detailsMark) && Objects.equals(blockupDate, blockup.blockupDate) && Objects.equals(staffName, blockup.staffName) && Objects.equals(registerId, blockup.registerId) && Objects.equals(blockupWhy, blockup.blockupWhy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(blockupSeriald, detailsMark, blockupDate, staffName, registerId, blockupWhy);
    }

    @Override
    public String toString() {
        return "Blockup{" +
                "blockupSeriald=" + blockupSeriald +
                ", detailsMark='" + detailsMark + '\'' +
                ", blockupDate=" + blockupDate +
                ", staffName='" + staffName + '\'' +
                ", registerId='" + registerId + '\'' +
                ", blockupWhy='" + blockupWhy + '\'' +
                '}';
    }
}
