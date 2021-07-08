package cn.gson.hui_ren_boot.model.pojos.permissions;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Rank {

    private long rankId;
    private String rankName;
    private Long rankSection;



    @Id
    @Column(name = "RANK_ID")
    public long getRankId() {
        return rankId;
    }

    public void setRankId(long rankId) {
        this.rankId = rankId;
    }

    @Basic
    @Column(name = "RANK_NAME")
    public String getRankName() {
        return rankName;
    }

    public void setRankName(String rankName) {
        this.rankName = rankName;
    }

    @Basic
    @Column(name = "RANK_SECTION")
    public Long getRankSection() {
        return rankSection;
    }

    public void setRankSection(Long rankSection) {
        this.rankSection = rankSection;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rank rank = (Rank) o;
        return rankId == rank.rankId && Objects.equals(rankName, rank.rankName) && Objects.equals(rankSection, rank.rankSection);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rankId, rankName, rankSection);
    }
}
