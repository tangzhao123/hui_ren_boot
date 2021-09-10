package cn.gson.hui_ren_boot.model.pojos.hospital;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
public class Hospitalcare {//床位护理扣费表

    private long hospitalcareId;//主键
    private String hospitalcareName;//患者名
    private Time hospitalcareDate;//扣费时间
    private String registerId;//住院号
    private Long hospitalcareMoney;//扣费总额
    private Long sickbedNursing;//护理费
    private Long sickbedCost;//床位费

    @Id
    @Column(name = "HOSPITALCARE_ID")
    public long getHospitalcareId() {
        return hospitalcareId;
    }

    public void setHospitalcareId(long hospitalcareId) {
        this.hospitalcareId = hospitalcareId;
    }
    @Basic
    @Column(name = "SICKBED_NURSING")
    public Long getSickbedNursing() {
        return sickbedNursing;
    }

    public void setSickbedNursing(Long sickbedNursing) {
        this.sickbedNursing = sickbedNursing;
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
    @Column(name = "HOSPITALCARE_NAME")
    public String getHospitalcareName() {
        return hospitalcareName;
    }

    public void setHospitalcareName(String hospitalcareName) {
        this.hospitalcareName = hospitalcareName;
    }

    @Basic
    @Column(name = "HOSPITALCARE_DATE")
    public Time getHospitalcareDate() {
        return hospitalcareDate;
    }

    public void setHospitalcareDate(Time hospitalcareDate) {
        this.hospitalcareDate = hospitalcareDate;
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
    @Column(name = "HOSPITALCARE_MONEY")
    public Long getHospitalcareMoney() {
        return hospitalcareMoney;
    }

    public void setHospitalcareMoney(Long hospitalcareMoney) {
        this.hospitalcareMoney = hospitalcareMoney;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hospitalcare that = (Hospitalcare) o;
        return hospitalcareId == that.hospitalcareId && Objects.equals(hospitalcareName, that.hospitalcareName) && Objects.equals(hospitalcareDate, that.hospitalcareDate) && Objects.equals(registerId, that.registerId) && Objects.equals(hospitalcareMoney, that.hospitalcareMoney);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hospitalcareId, hospitalcareName, hospitalcareDate, registerId, hospitalcareMoney);
    }
}
