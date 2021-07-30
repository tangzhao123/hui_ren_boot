package cn.gson.hui_ren_boot.model.mapper.hospital;

import cn.gson.hui_ren_boot.model.pojos.hospital.Advice;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AdviceMapper {
    public List<Advice> allDispensing();//药房查询医嘱
    public void addAdvice(Advice advice);//批量新增主医嘱
    public List<Advice> selectAdvice(Advice inputboxs);//医嘱管理查询
    public void assAdvice(Advice j);//修改主表时间
}
