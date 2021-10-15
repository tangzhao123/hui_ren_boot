package cn.gson.hui_ren_boot.model.service.pharmacy;

import cn.gson.hui_ren_boot.model.mapper.pharmacy.DisposesApplyMapper;
import cn.gson.hui_ren_boot.model.pojos.pharmacy.DisposeApply;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class DisposesApplyService {
    @Autowired
    DisposesApplyMapper disposeApplyMapper;
    public Object disposeByPage(Integer pageNo,Integer size, String applyNum,String applyBatch,String drugName){
        return disposeApplyMapper.dispose(applyNum, applyBatch, drugName);
    }

}
