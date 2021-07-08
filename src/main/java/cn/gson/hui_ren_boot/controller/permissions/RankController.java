package cn.gson.hui_ren_boot.controller.permissions;

import cn.gson.hui_ren_boot.model.pojos.permissions.Rank;
import cn.gson.hui_ren_boot.model.service.permissions.RankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RankController {

    @Autowired
    RankService rankService;

    //查询所有的职称
    @GetMapping("rank-list")
    public List<Rank> allRank(){
        return rankService.allRank();
    }
}
