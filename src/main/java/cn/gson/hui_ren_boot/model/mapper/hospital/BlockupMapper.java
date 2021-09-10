package cn.gson.hui_ren_boot.model.mapper.hospital;

import cn.gson.hui_ren_boot.model.pojos.hospital.Blockup;
import cn.gson.hui_ren_boot.model.pojos.medical.Combinspection;
import cn.gson.hui_ren_boot.model.pojos.medical.Test;
import cn.gson.hui_ren_boot.model.pojos.medical.Testmiddle;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BlockupMapper {
    public void addBlockup(Blockup block);//添加
    public void addTest(Test test);//体检表添加
    public List<Test>selText(Test test);
    public void addTestmiddle(Testmiddle testmiddle);
    public List<Combinspection>allResults(Combinspection combinspection);
}
