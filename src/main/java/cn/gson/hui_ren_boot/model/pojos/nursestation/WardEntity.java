package cn.gson.hui_ren_boot.model.pojos.nursestation;

import cn.gson.hui_ren_boot.model.pojos.permissions.Medical;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "WARD", schema = "HUIREN")
public class WardEntity {
    private long wardId;
    private String wardMark;
//    private Long medicalId;
    private String staffId;
    private Long wardSite;
    private String wardBeds;
    private Long wardHave;
    private Double wardCost;
    private Double wardNursing;
    private Medical medical;
    private List<SickbedEntity> sickbeds;

    @OneToMany
    public List<SickbedEntity> getSickbeds() {
        return sickbeds;
    }

    public void setSickbeds(List<SickbedEntity> sickbeds) {
        this.sickbeds = sickbeds;
    }

    @ManyToOne
    @JoinColumn(name = "MEDICAL_ID" , referencedColumnName = "MEDICAL_ID")
    public Medical getMedical() {
        return medical;
    }

    public void setMedical(Medical medical) {
        this.medical = medical;
    }

    @Id
    @Column(name = "WARD_ID")
    public long getWardId() {
        return wardId;
    }

    public void setWardId(long wardId) {
        this.wardId = wardId;
    }

    @Basic
    @Column(name = "WARD_MARK")
    public String getWardMark() {
        return wardMark;
    }

    public void setWardMark(String wardMark) {
        this.wardMark = wardMark;
    }

//    @Basic
//    @Column(name = "MEDICAL_ID")
//    public Long getMedicalId() {
//        return medicalId;
//    }
//
//    public void setMedicalId(Long medicalId) {
//        this.medicalId = medicalId;
//    }

    @Basic
    @Column(name = "STAFF_ID")
    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    @Basic
    @Column(name = "WARD_SITE")
    public Long getWardSite() {
        return wardSite;
    }

    public void setWardSite(Long wardSite) {
        this.wardSite = wardSite;
    }

    @Basic
    @Column(name = "WARD_BEDS")
    public String getWardBeds() {
        return wardBeds;
    }

    public void setWardBeds(String wardBeds) {
        this.wardBeds = wardBeds;
    }

    @Basic
    @Column(name = "WARD_HAVE")
    public Long getWardHave() {
        return wardHave;
    }

    public void setWardHave(Long wardHave) {
        this.wardHave = wardHave;
    }

    @Basic
    @Column(name = "WARD_COST")
    public Double getWardCost() {
        return wardCost;
    }

    public void setWardCost(Double wardCost) {
        this.wardCost = wardCost;
    }

    @Basic
    @Column(name = "WARD_NURSING")
    public Double getWardNursing() {
        return wardNursing;
    }

    public void setWardNursing(Double wardNursing) {
        this.wardNursing = wardNursing;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WardEntity that = (WardEntity) o;
        return wardId == that.wardId && Objects.equals(wardMark, that.wardMark) && Objects.equals(medical, that.medical) && Objects.equals(staffId, that.staffId) && Objects.equals(wardSite, that.wardSite) && Objects.equals(wardBeds, that.wardBeds) && Objects.equals(wardHave, that.wardHave) && Objects.equals(wardCost, that.wardCost) && Objects.equals(wardNursing, that.wardNursing);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wardId, wardMark, medical, staffId, wardSite, wardBeds, wardHave, wardCost, wardNursing);
    }

    @Override
    public String toString() {
        return "WardEntity{" +
                "wardId=" + wardId +
                ", wardMark='" + wardMark + '\'' +
                ", staffId='" + staffId + '\'' +
                ", wardSite=" + wardSite +
                ", wardBeds='" + wardBeds + '\'' +
                ", wardHave=" + wardHave +
                ", wardCost=" + wardCost +
                ", wardNursing=" + wardNursing +
                ", medical=" + medical +
                '}';
    }
}
