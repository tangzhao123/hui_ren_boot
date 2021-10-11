package cn.gson.hui_ren_boot.model.mapper.hospital;

import cn.gson.hui_ren_boot.model.pojos.hospital.Casefile;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CasefileMapper {
    public void addCasefile(Casefile casefile);//新增病案
    public List<Casefile> selectCasefile(Casefile casefile);//查询病历
    public List<Casefile> allCasefile(String adviceId);//按医嘱号查询
}
