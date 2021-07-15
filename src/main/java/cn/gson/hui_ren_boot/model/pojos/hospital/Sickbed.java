package cn.gson.hui_ren_boot.model.pojos.hospital;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Sickbed {//病床信息表
    private long sickbedSerial;//序号
    private String wardMark;//病房编号
    private Long sickbedCost;//床位费
    private String sickbedMark;//床位号
    private Long sickbedState;//使用状态
    private Long sickbedNursing;//护理费


    @Id
    @Column(name = "SICKBED_SERIAL")
    public long getSickbedSerial() {
        return sickbedSerial;
    }

    public void setSickbedSerial(long sickbedSerial) {
        this.sickbedSerial = sickbedSerial;
    }

    @Basic
    @Column(name = "WARD_MARK")
    public String getWardMark() {
        return wardMark;
    }

    public void setWardMark(String wardMark) {
        this.wardMark = wardMark;
    }

    @Basic
    @Column(name = "SICKBED_COST")
    public Long getSickbedCost() {
        return sickbedCost;
    }

    public void setSickbedCost(Long sickbedCost) {
        this.sickbedCost = sickbedCost;
    }

    @Basic
    @Column(name = "SICKBED_MARK")
    public String getSickbedMark() {
        return sickbedMark;
    }

    public void setSickbedMark(String sickbedMark) {
        this.sickbedMark = sickbedMark;
    }

    @Basic
    @Column(name = "SICKBED_STATE")
    public Long getSickbedState() {
        return sickbedState;
    }

    public void setSickbedState(Long sickbedState) {
        this.sickbedState = sickbedState;
    }

    @Basic
    @Column(name = "SICKBED_NURSING")
    public Long getSickbedNursing() {
        return sickbedNursing;
    }

    public void setSickbedNursing(Long sickbedNursing) {
        this.sickbedNursing = sickbedNursing;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sickbed sickbed = (Sickbed) o;
        return sickbedSerial == sickbed.sickbedSerial && Objects.equals(wardMark, sickbed.wardMark) && Objects.equals(sickbedCost, sickbed.sickbedCost) && Objects.equals(sickbedMark, sickbed.sickbedMark) && Objects.equals(sickbedState, sickbed.sickbedState) && Objects.equals(sickbedNursing, sickbed.sickbedNursing);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sickbedSerial, wardMark, sickbedCost, sickbedMark, sickbedState, sickbedNursing);
    }
}
