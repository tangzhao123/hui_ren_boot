package cn.gson.hui_ren_boot.model.service.permissions;

import cn.gson.hui_ren_boot.model.mapper.permissions.SectionMapper;
import cn.gson.hui_ren_boot.model.pojos.permissions.Section;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SectionService {

    @Autowired
    SectionMapper sectionMapper;

    //查询所有的部门
    public List<Section> allSection(){
        return sectionMapper.allSection();
    }

    //根据名称查询编号
    public int byId(String sectionName){
        return sectionMapper.bySectionId(sectionName);
    }
}
