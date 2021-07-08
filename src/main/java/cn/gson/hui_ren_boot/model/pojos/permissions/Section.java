package cn.gson.hui_ren_boot.model.pojos.permissions;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;
import java.util.Objects;

@Entity
public class Section {

    private long sectionId;
    private String sectionName;
    private Date sectionTimestamp;


    @Id
    @Column(name = "SECTION_ID")
    public long getSectionId() {
        return sectionId;
    }

    public void setSectionId(long sectionId) {
        this.sectionId = sectionId;
    }

    @Basic
    @Column(name = "SECTION_NAME")
    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    @Basic
    @Column(name = "SECTION_TIMESTAMP")
    public Date getSectionTimestamp() {
        return sectionTimestamp;
    }

    public void setSectionTimestamp(Date sectionTimestamp) {
        this.sectionTimestamp = sectionTimestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Section section = (Section) o;
        return sectionId == section.sectionId && Objects.equals(sectionName, section.sectionName) && Objects.equals(sectionTimestamp, section.sectionTimestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sectionId, sectionName, sectionTimestamp);
    }
}
