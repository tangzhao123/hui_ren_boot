package cn.gson.hui_ren_boot.model.service.medical;

import cn.gson.hui_ren_boot.model.mapper.medical.CmoboMapper;
import cn.gson.hui_ren_boot.model.pojos.medical.Cmobo;
import cn.gson.hui_ren_boot.model.pojos.medical.Comboitem;
import cn.gson.hui_ren_boot.model.pojos.medical.Combomiddle;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CmoboSerivice {
    @Autowired
    CmoboMapper cmoboMapper;//体检套餐mapper

    //查询套餐里的项目、
    public List<Comboitem> selectAll(String comboSerial){
        return cmoboMapper.selectAll(comboSerial);
    }

    //新增中间表
    public void addMiddle(Combomiddle combomiddle){
        cmoboMapper.addMiddle(combomiddle);
    }

    //新增体检套餐
    public void addCmobo(Cmobo cmobo){
        cmoboMapper.addCmobo(cmobo);
    }

    //查询体检套餐
    public Object seeCmoboByPage(Cmobo cmobo){
        return cmoboMapper.seeCmobo(cmobo);
    };

    //查询体检项目
    public List<Comboitem> allComboitem(){
        return cmoboMapper.allComboitem();
    }

}
