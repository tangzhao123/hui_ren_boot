package cn.gson.hui_ren_boot.model.service.medical;

import cn.gson.hui_ren_boot.model.dao.medical.ComboitemDao;
import cn.gson.hui_ren_boot.model.mapper.medical.CmoboMapper;
import cn.gson.hui_ren_boot.model.mapper.medical.ComboitemMapper;
import cn.gson.hui_ren_boot.model.mapper.medical.TestMapper;
import cn.gson.hui_ren_boot.model.pojos.medical.Cmobo;
import cn.gson.hui_ren_boot.model.pojos.medical.Comboitem;
import cn.gson.hui_ren_boot.model.pojos.medical.Test;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class ComboitemService {
    @Autowired
    ComboitemMapper com;//体检项目

    @Autowired
    ComboitemDao comboitemDao;//体检道层

    @Autowired
    CmoboMapper cmoboMapper;//体检套餐mapper

    //查询体检套餐
    public List<Cmobo> seeCmobo(){
        return cmoboMapper.seeCmobo();
    };

    //查询体检项目
    public Object selectAllByPage(int pageNo,int size,Comboitem comboitem){
        return com.selectAll(comboitem);
    }
    //新增体检项目
    public void addComboitem(Comboitem comboitem){
        com.addComboitem(comboitem);
    }

    //修改体检项目
    public void updateComboitem(Comboitem comboitem){
        com.updateComboitem(comboitem);
    }

    //删除体检项目
    public void delComboitem(Long id){
        comboitemDao.deleteById(id);
    }
}
