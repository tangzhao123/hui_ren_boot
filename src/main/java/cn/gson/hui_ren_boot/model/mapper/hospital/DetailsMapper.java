package cn.gson.hui_ren_boot.model.mapper.hospital;

import cn.gson.hui_ren_boot.model.pojos.hospital.Details;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DetailsMapper {
    public List<Details> allDetails(Details jk);//药房医嘱详情查询
    public void addDetails(List<Details> detail);//批量新增医嘱详情
    public List<Details>seletDetails(Details adviceId);//医嘱详情管理
    public List<Details>queryDeta(String adviceId);//查询详单
    public void upDetails(Details adv);//主表停嘱
    public void upDetailw(Details k);//从表停嘱
}
