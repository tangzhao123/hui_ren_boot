package cn.gson.hui_ren_boot.model.pojos.hospital;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Ward {//病房表

    private long wardId;//主键
    private String wardMark;//病床号
    private Long medicalId;//科室id
    private String staffId;//负责的护士
    private Long wardSite;//床位数
    private String wardBeds;//地址
    private Long wardHave;//已使用床位数
    private Long wardCost;//床位费
    private Long wardNursing;//护理费



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
        Ward ward = (Ward) o;
        return wardId == ward.wardId && Objects.equals(wardMark, ward.wardMark) && Objects.equals(medicalId, ward.medicalId) && Objects.equals(staffId, ward.staffId) && Objects.equals(wardSite, ward.wardSite) && Objects.equals(wardBeds, ward.wardBeds) && Objects.equals(wardHave, ward.wardHave) && Objects.equals(wardCost, ward.wardCost) && Objects.equals(wardNursing, ward.wardNursing);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wardId, wardMark, medicalId, staffId, wardSite, wardBeds, wardHave, wardCost, wardNursing);
    }
}
