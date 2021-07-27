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
    public Object seletDetailsByPage(Integer pageNo,Integer size,Details inputboxs){
      return   detailsMapper.seletDetails(inputboxs);
    }
    public  List<Details>queryDeta(String adviceId){//
        return  detailsMapper.queryDeta(adviceId);
    }
    public void upDetails(String adviceId){//主表停嘱
            detailsMapper.upDetails(adviceId);
    }
    public void upDetailw(String daralisMark){//从表停嘱
        detailsMapper.upDetailw(daralisMark);
    }
}
