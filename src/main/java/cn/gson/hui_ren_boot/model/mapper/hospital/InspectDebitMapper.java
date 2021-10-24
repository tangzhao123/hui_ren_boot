package cn.gson.hui_ren_boot.model.mapper.hospital;

import cn.gson.hui_ren_boot.model.pojos.hospital.InspectDebit;
import cn.gson.hui_ren_boot.model.pojos.hospital.Register;
import cn.gson.hui_ren_boot.model.pojos.outpatient.TreatmentCard;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface InspectDebitMapper {
public void addinsert(InspectDebit inspectdebit ) ;//新增体检扣费记录
public void    deText(String testAccount);//删除体检单
public void    deTestmiddle(String testAccount);//删除体检单
public void   upTreatmentCard(TreatmentCard treatmentCard);//修改金额
public Register    allReistery(String testPhone);//查询诊疗卡
public void deInsert(String testPhone);//删除扣费记录表
}
