package cn.gson.hui_ren_boot.model.mapper.medical;

import cn.gson.hui_ren_boot.model.pojos.medical.Test;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ZhuYuanMapper {
    //查询
    public List<Test> zycomo(Test test);
}
