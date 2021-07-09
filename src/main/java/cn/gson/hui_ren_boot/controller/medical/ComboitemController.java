package cn.gson.hui_ren_boot.controller.medical;

import cn.gson.hui_ren_boot.model.pojos.medical.Comboitem;
import cn.gson.hui_ren_boot.model.service.medical.ComboitemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ComboitemController {
    @Autowired
    ComboitemService comboitemService;

    //查询所有体检项目
    @GetMapping("comboitem-list")
    public List<Comboitem> selectAll(){
        return comboitemService.selectAll();
    }
}
