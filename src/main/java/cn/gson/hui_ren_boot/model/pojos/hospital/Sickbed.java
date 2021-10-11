package cn.gson.hui_ren_boot.model.pojos.hospital;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Sickbed {//病床信息表
    private long sickbedSerial;//序号
    private String wardMark;//病房编号
    private String sickbedMark;//床位号
    private Long sickbedState;//使用状态



    @Id
    @SequenceGenerator(sequenceName = "seq_huiren",name = "seq",allocationSize = 1,initialValue = 1)
    @GeneratedValue(generator = "seq",strategy = GenerationType.SEQUENCE)
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
        Sickbed sickbed = (Sickbed) o;
        return sickbedSerial == sickbed.sickbedSerial && Objects.equals(wardMark, sickbed.wardMark)  && Objects.equals(sickbedMark, sickbed.sickbedMark) && Objects.equals(sickbedState, sickbed.sickbedState) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sickbedSerial, wardMark, sickbedMark, sickbedState);
    }

    @Override
    public String toString() {
        return "Sickbed{" +
                "sickbedSerial=" + sickbedSerial +
                ", wardMark='" + wardMark + '\'' +
                ", sickbedMark='" + sickbedMark + '\'' +
                ", sickbedState=" + sickbedState +
                '}';
    }
}
