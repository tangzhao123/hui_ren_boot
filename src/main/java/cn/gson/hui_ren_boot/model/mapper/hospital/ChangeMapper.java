package cn.gson.hui_ren_boot.model.mapper.hospital;

import cn.gson.hui_ren_boot.model.pojos.hospital.Change;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper

public interface ChangeMapper {

    public void addChange(Change change);//添加
    public List<Change> allChange();//查询
    public void deChange(Change change);//删除
    public List<Change>asChange(Change change);//分页查询
}
