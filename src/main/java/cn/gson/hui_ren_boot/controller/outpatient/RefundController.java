package cn.gson.hui_ren_boot.controller.outpatient;

import cn.gson.hui_ren_boot.model.pojos.outpatient.Refund;
import cn.gson.hui_ren_boot.model.service.outpatient.RefundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.List;

/**
 * 退费
 */
@RestController
@RequestMapping("/outpatient")
public class RefundController {
    @Autowired
    RefundService refundService;

    //查询退费记录
    @RequestMapping("/sel-refund")
    public List<Refund> selRefund(@RequestBody Refund refund){
        String start  = null;
        String end = null;
        if(refund.getStart() != null && refund.getEnd() != null){
            SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
            start = sf.format(refund.getStart());
            end = sf.format(refund.getEnd());
        }
        return refundService.selRefund(start,end, refund.getStaffName());
    }
}
