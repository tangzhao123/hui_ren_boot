package cn.gson.hui_ren_boot.model.pojos.nursestation;

import cn.gson.hui_ren_boot.model.pojos.permissions.Medical;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "WARD", schema = "HUIREN")
public class WardEntity {
    private long wardId;
    private String wardMark;
//    private Long medicalId;
    private Long staffId;
    private Long wardSite;
    private String wardBeds;
    private Long wardHave;
    private Long wardCost;
    private Long wardNursing;
    private Medical medical;

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
    public Long getStaffId() {
        return staffId;
    }

    public void setStaffId(Long staffId) {
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
    public Long getWardCost() {
        return wardCost;
    }

    public void setWardCost(Long wardCost) {
        this.wardCost = wardCost;
    }

    @Basic
    @Column(name = "WARD_NURSING")
    public Long getWardNursing() {
        return wardNursing;
    }

    public void setWardNursing(Long wardNursing) {
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
}
