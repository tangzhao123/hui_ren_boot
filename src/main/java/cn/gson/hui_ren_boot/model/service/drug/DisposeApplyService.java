package cn.gson.hui_ren_boot.model.service.drug;


import cn.gson.hui_ren_boot.model.mapper.drug.DestructionMapper;
import cn.gson.hui_ren_boot.model.mapper.drug.DisposeApplyMapper;
import cn.gson.hui_ren_boot.model.pojos.pharmacy.Destruction;
import cn.gson.hui_ren_boot.model.pojos.pharmacy.DisposeApply;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class DisposeApplyService {

    @Autowired
    DisposeApplyMapper disposeApplyMapper;

    @Autowired
    DestructionMapper destructionMapper;

    //新增销毁申请单跟销毁申请详单
    public void addDisposeApply(DisposeApply disposeApply){
        disposeApplyMapper.addDisposeApply(disposeApply);
        destructionMapper.addDestruction(disposeApply.getDisposeApplyData(),disposeApply.getApplyNum());
    }

    //查询所有的销毁申请详单
    public List<String> findAllDestruction(){
        return destructionMapper.findAllDestruction();
    }

    //查询所有未审批的销毁申请单
    public Object findAllDisposeApplyByPage(Integer pageNo,Integer size){
        return disposeApplyMapper.findAllDisposeApply();
    }

    //根据销毁申请单号查询详单
    public List<Destruction> allDestruction(String applyId){
        return destructionMapper.allDestruction(applyId);
    }

    //审批销毁申请单
    public void updateDisposeApply(Long applyApproval, String applyNum){
        disposeApplyMapper.updateDisposeApply(applyApproval,applyNum);
    }

    //查询所有已经审批的销毁申请
    public Object allDisposeApplyByPage(Integer pageNo,Integer size){
        return disposeApplyMapper.allDisposeApply();
    }

    //新增出库单号跟出库时间
    public void updateApply(Date applyTime, String applyGo, String applyNum){
        disposeApplyMapper.updateApply(applyTime,applyGo,applyNum);
    }
}
