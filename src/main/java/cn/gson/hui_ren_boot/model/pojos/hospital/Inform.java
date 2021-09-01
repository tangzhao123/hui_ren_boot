package cn.gson.hui_ren_boot.model.pojos.hospital;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;
import java.util.Objects;

@Entity
public class Inform {

    private long informId;//主键
    private String informPatients;//患者名
    private Date informDate;//时间
    private String informWhy;//原因
    private String informDoctor;//医生名
    private String registerId;//住院号
    private long informState;//状态
    @Id
    @SequenceGenerator(sequenceName = "seq_huiren",name = "seq",allocationSize = 1,initialValue = 1)
    @GeneratedValue(generator = "seq",strategy = GenerationType.SEQUENCE)
    @Column(name = "INFORM_ID")
    public long getInformId() {
        return informId;
    }

    public void setInformId(long informId) {
        this.informId = informId;
    }
    @Basic
    @Column(name = "INFORM_STATE")
    public long getInformState() {
        return informState;
    }

    public void setInformState(long informState) {
        this.informState = informState;
    }

    @Basic
    @Column(name = "INFORM_PATIENTS")
    public String getInformPatients() {
        return informPatients;
    }

    public void setInformPatients(String informPatients) {
        this.informPatients = informPatients;
    }

    @Basic
    @Column(name = "INFORM_DATE")
    public Date getInformDate() {
        return informDate;
    }

    public void setInformDate(Date informDate) {
        this.informDate = informDate;
    }

    @Basic
    @Column(name = "INFORM_WHY")
    public String getInformWhy() {
        return informWhy;
    }

    public void setInformWhy(String informWhy) {
        this.informWhy = informWhy;
    }

    @Basic
    @Column(name = "INFORM_DOCTOR")
    public String getInformDoctor() {
        return informDoctor;
    }

    public void setInformDoctor(String informDoctor) {
        this.informDoctor = informDoctor;
    }

    @Basic
    @Column(name = "REGISTER_ID")
    public String getRegisterId() {
        return registerId;
    }

    public void setRegisterId(String registerId) {
        this.registerId = registerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Inform inform = (Inform) o;
        return informId == inform.informId && Objects.equals(informPatients, inform.informPatients) && Objects.equals(informDate, inform.informDate) && Objects.equals(informWhy, inform.informWhy) && Objects.equals(informDoctor, inform.informDoctor) && Objects.equals(registerId, inform.registerId) && Objects.equals(informState, inform.informState);
    }

    @Override
    public int hashCode() {
        return Objects.hash(informId, informPatients, informDate, informWhy, informDoctor, registerId,informState);
    }
}
