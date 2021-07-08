package cn.gson.hui_ren_boot.model.service.permissions;

import cn.gson.hui_ren_boot.model.mapper.permissions.RankMapper;
import cn.gson.hui_ren_boot.model.pojos.permissions.Rank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class RankService {

    @Autowired
    RankMapper rankMapper;

    //查询所有的职称
    public List<Rank> allRank(){
        return rankMapper.allRank();
    }

    //根据名称查询编号
    public int byId(String rankName){
        return rankMapper.byRankId(rankName);
    }
}
