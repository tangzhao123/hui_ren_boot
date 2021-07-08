package cn.gson.hui_ren_boot.controller.permissions;

import cn.gson.hui_ren_boot.model.pojos.permissions.Section;
import cn.gson.hui_ren_boot.model.service.permissions.SectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SectionController {

    @Autowired
    SectionService sectionService;

    //查询所有的部门
    @GetMapping("section-list")
    public List<Section> allSection(){
        return sectionService.allSection();
    }
}
