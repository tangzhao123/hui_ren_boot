package cn.gson.hui_ren_boot.model.mapper.medical;

import cn.gson.hui_ren_boot.model.pojos.medical.Cmobo;
import cn.gson.hui_ren_boot.model.pojos.medical.Comboitem;
import cn.gson.hui_ren_boot.model.pojos.medical.Combomiddle;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CmoboMapper {

    //查询套餐里面的项目
    public List<Comboitem> selectAll(String comboSerial);

    //查询体检套餐
    public List<Cmobo> seeCmobo(Cmobo cmobo);

    //体检项目
    public List<Comboitem> allComboitem();

    //新增体检套餐
    public void addCmobo(Cmobo cmobo);

    //新增中间表
    public void addMiddle(Combomiddle combomiddle);
}
