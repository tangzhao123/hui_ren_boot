package cn.gson.hui_ren_boot.model.service.hospital;

import cn.gson.hui_ren_boot.model.mapper.hospital.CasefileMapper;
import cn.gson.hui_ren_boot.model.pojos.hospital.Casefile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class CasefileService {
    @Autowired
    CasefileMapper casefieMapper;
    public void addCasefie(Casefile casefie){//添加病例
        casefieMapper.addCasefile(casefie);
    }
    public List<Casefile> selectCasefile(Casefile casefie){//查询
       return casefieMapper.selectCasefile(casefie);
    }
    public List<Casefile> allCasefile(String adviceId){//安医嘱查询判断
        return  casefieMapper.allCasefile(adviceId);
    }
}
