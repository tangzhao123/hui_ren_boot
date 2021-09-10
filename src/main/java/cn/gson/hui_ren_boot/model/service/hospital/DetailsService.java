package cn.gson.hui_ren_boot.model.service.hospital;

import cn.gson.hui_ren_boot.model.mapper.hospital.DetailsMapper;
import cn.gson.hui_ren_boot.model.pojos.hospital.Advice;
import cn.gson.hui_ren_boot.model.pojos.hospital.Details;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DetailsService {
    @Autowired
    DetailsMapper detailsMapper;
    public List<Details> allDetails(Details jk){//查询
        return detailsMapper.allDetails(jk);
    }
    public List<Details> seletDetails(Details Detailw){
      return   detailsMapper.seletDetails(Detailw);
    }
    public  List<Details>queryDeta(String adviceId){//
        return  detailsMapper.queryDeta(adviceId);
    }
    public void upDetails(Details k){//主表停嘱
            detailsMapper.upDetails(k);
    }
    public void upDetailw(Details avi){//从表停嘱
        detailsMapper.upDetailw(avi);
    }
}
