package cn.gson.hui_ren_boot.model.pojos.hospital;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Ward {

    private long wardId;
    private String wardMark;
    private Long medicalId;
    private String staffId;
    private Long wardSite;
    private String wardBeds;
    private Long wardHave;



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

    @Basic
    @Column(name = "MEDICAL_ID")
    public Long getMedicalId() {
        return medicalId;
    }

    public void setMedicalId(Long medicalId) {
        this.medicalId = medicalId;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ward ward = (Ward) o;
        return wardId == ward.wardId && Objects.equals(wardMark, ward.wardMark) && Objects.equals(medicalId, ward.medicalId) && Objects.equals(staffId, ward.staffId) && Objects.equals(wardSite, ward.wardSite) && Objects.equals(wardBeds, ward.wardBeds) && Objects.equals(wardHave, ward.wardHave);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wardId, wardMark, medicalId, staffId, wardSite, wardBeds, wardHave);
    }
}
