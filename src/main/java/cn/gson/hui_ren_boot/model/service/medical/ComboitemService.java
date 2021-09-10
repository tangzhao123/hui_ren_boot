package cn.gson.hui_ren_boot.model.service.medical;

import cn.gson.hui_ren_boot.model.dao.medical.ComboitemDao;
import cn.gson.hui_ren_boot.model.mapper.medical.ComboitemMapper;
import cn.gson.hui_ren_boot.model.pojos.medical.Comboitem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ComboitemService {
    @Autowired
    ComboitemMapper com;//体检项目

    @Autowired
    ComboitemDao comboitemDao;//体检道层

    //查询项目
    public List<Comboitem> selecitem(Long itemId){
        return com.selecitem(itemId);
    }

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
