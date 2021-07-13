package cn.gson.hui_ren_boot.model.pojos.permissions;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Medical {

    private long medicalId;
    private String medicalName;
    private Long medicalSublevel;



    @Id
    @SequenceGenerator(sequenceName = "seq_huiren",name = "seq",allocationSize = 1,initialValue = 1)
    @GeneratedValue(generator = "seq",strategy = GenerationType.SEQUENCE)
    @Column(name = "MEDICAL_ID")
    public long getMedicalId() {
        return medicalId;
    }

    public void setMedicalId(long medicalId) {
        this.medicalId = medicalId;
    }

    @Basic
    @Column(name = "MEDICAL_NAME")
    public String getMedicalName() {
        return medicalName;
    }

    public void setMedicalName(String medicalName) {
        this.medicalName = medicalName;
    }

    @Basic
    @Column(name = "MEDICAL_SUBLEVEL")
    public Long getMedicalSublevel() {
        return medicalSublevel;
    }

    public void setMedicalSublevel(Long medicalSublevel) {
        this.medicalSublevel = medicalSublevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Medical medical = (Medical) o;
        return medicalId == medical.medicalId && Objects.equals(medicalName, medical.medicalName) && Objects.equals(medicalSublevel, medical.medicalSublevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(medicalId, medicalName, medicalSublevel);
    }


    @Override
    public String toString() {
        return "Medical{" +
                "medicalId=" + medicalId +
                ", medicalName='" + medicalName + '\'' +
                ", medicalSublevel=" + medicalSublevel +
                '}';
    }
}
