package cn.gson.hui_ren_boot.model.service.outpatient;

import cn.gson.hui_ren_boot.model.mapper.outpatient.RefundMapper;
import cn.gson.hui_ren_boot.model.pojos.outpatient.Refund;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 退费记录
 */
@Service
@Transactional
public class RefundService {
    @Autowired
    RefundMapper refundMapper;

    //查询退费记录
    public List<Refund> selRefund(String start,String end,String staffName){
        return refundMapper.selRefund(start, end, staffName);
    }
}
