package cn.gson.hui_ren_boot.model.mapper.permissions;

import cn.gson.hui_ren_boot.model.pojos.permissions.Rank;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RankMapper {

    //查询所有的职称
    public List<Rank> allRank();

//    //根据名称查询编号
    public int byRankId(String rankName);
}
