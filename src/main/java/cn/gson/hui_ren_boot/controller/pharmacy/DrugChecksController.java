package cn.gson.hui_ren_boot.controller.pharmacy;

import cn.gson.hui_ren_boot.model.pojos.pharmacy.DrugCheck;
import cn.gson.hui_ren_boot.model.service.pharmacy.DrugChecksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("drugCheck")
public class DrugChecksController {
    @Autowired
    DrugChecksService drugChecksService;
    @RequestMapping("check")
    public Object checkByPage(Integer pageNo, Integer size, DrugCheck drugCheck){
        return drugChecksService.checkByPage(pageNo,size,drugCheck);
    }
}
