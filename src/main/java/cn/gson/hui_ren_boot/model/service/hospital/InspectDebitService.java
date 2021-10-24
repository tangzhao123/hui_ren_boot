package cn.gson.hui_ren_boot.model.service.hospital;

import cn.gson.hui_ren_boot.model.mapper.hospital.InspectDebitMapper;
import cn.gson.hui_ren_boot.model.pojos.hospital.Register;
import cn.gson.hui_ren_boot.model.pojos.medical.Test;
import cn.gson.hui_ren_boot.model.pojos.outpatient.TreatmentCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class InspectDebitService {
    @Autowired
    InspectDebitMapper inspectDebitMapper;
    //查询
    public void deTextw(Test test){//删除体检单
        inspectDebitMapper.deText(test.getTestAccount());//删除体检单
        inspectDebitMapper.deTestmiddle(test.getTestAccount());//删除体检单中间表
        Register m= inspectDebitMapper.allReistery(test.getTestPhone());//通过电话号码查询就诊卡号
        TreatmentCard l=new TreatmentCard();//新建就诊卡实体类赋值
        l.setTreatmentCard(m.getRegisterClinic());
        l.setTreatmentBalance(test.getTestMoney());
        inspectDebitMapper.upTreatmentCard(l);//修改就诊卡金额
        inspectDebitMapper.deInsert(test.getTestPhone());//删除检验扣费记录
    }

}
