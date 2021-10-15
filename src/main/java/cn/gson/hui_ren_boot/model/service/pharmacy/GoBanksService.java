package cn.gson.hui_ren_boot.model.service.pharmacy;

import cn.gson.hui_ren_boot.model.mapper.pharmacy.GoBanksMapper;
import cn.gson.hui_ren_boot.model.pojos.pharmacy.GoBank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class GoBanksService {
    @Autowired
    GoBanksMapper goBankMapper;
    public Object goBankByPage(Integer pageNo,Integer size,String goNum,String goBatch,String drugName){
        return goBankMapper.goBank(goNum, goBatch, drugName);
    }
}
