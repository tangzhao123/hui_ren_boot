package cn.gson.hui_ren_boot.model.mapper.hospital;

import cn.gson.hui_ren_boot.model.pojos.hospital.Inform;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface InformMapper {
    public void addInform(Inform inform);//新增
    public List<Inform>selectInform(Inform inform);//查询
    public void deleteInform(Inform inform);//删除
}
