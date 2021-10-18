package cn.gson.hui_ren_boot.model.mapper.medical;

import cn.gson.hui_ren_boot.model.pojos.medical.Combinspection;
import cn.gson.hui_ren_boot.model.pojos.medical.Comboitem;
import cn.gson.hui_ren_boot.model.pojos.medical.Test;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ZhuYuanMapper {
    //修改体检的状态
    public void updateitem(String testAccount);

    //新增结果
    public void zyspection(Combinspection combinspection);

    //项目
    public List<Comboitem> zyitem(String testAccount);

    //查询
    public List<Test> zycomo(Test test);
}
