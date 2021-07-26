package cn.gson.hui_ren_boot.model.pojos.nursestation;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "SICKBED", schema = "HUIREN")
public class SickbedEntity {
    private long sickbedSerial;
//    private String wardMark;
    private String sickbedMark;
    private Long sickbedState;
    private WardEntity wardEntity;

    @ManyToOne
    @JoinColumn(name = "WARD_MARK" , referencedColumnName = "WARD_MARK")
    public WardEntity getWardEntity() {
        return wardEntity;
    }

    public void setWardEntity(WardEntity wardEntity) {
        this.wardEntity = wardEntity;
    }

    @Id
    @Column(name = "SICKBED_SERIAL")
    public long getSickbedSerial() {
        return sickbedSerial;
    }

    public void setSickbedSerial(long sickbedSerial) {
        this.sickbedSerial = sickbedSerial;
    }

//    @Basic
//    @Column(name = "WARD_MARK")
//    public String getWardMark() {
//        return wardMark;
//    }
//
//    public void setWardMark(String wardMark) {
//        this.wardMark = wardMark;
//    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SickbedEntity that = (SickbedEntity) o;
        return sickbedSerial == that.sickbedSerial && Objects.equals(wardEntity, that.wardEntity) && Objects.equals(sickbedMark, that.sickbedMark) && Objects.equals(sickbedState, that.sickbedState);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sickbedSerial, wardEntity, sickbedMark, sickbedState);
    }
}
