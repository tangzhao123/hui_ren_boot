package cn.gson.hui_ren_boot.model.service.hospital;

import cn.gson.hui_ren_boot.model.mapper.hospital.AdviceMapper;

import cn.gson.hui_ren_boot.model.mapper.hospital.DetailsMapper;
import cn.gson.hui_ren_boot.model.pojos.hospital.Advice;
import cn.gson.hui_ren_boot.model.pojos.hospital.Details;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AdviceService {
    @Autowired
    AdviceMapper adviceMapper;
    @Autowired
    DetailsMapper detailsMapper;
    //药房医嘱表查询
    public List<Advice> allDispensing(){
        return adviceMapper.allDispensing();
    }
    public void addAdvices(Advice advice,List<Details>detail){//添加医嘱表
        System.out.println(advice);
        System.out.println(detail);
        adviceMapper.addAdvice(advice);
        detailsMapper.addDetails(detail);
    }
    public List<Advice> selectAdvice(Advice advice){//医嘱管理查询
        return adviceMapper.selectAdvice(advice);
    }
    public void assAdvice(Advice j){//修改主单时间
        adviceMapper.assAdvice(j);
    }
}
