package cn.gson.hui_ren_boot.controller.drug;

import cn.gson.hui_ren_boot.model.pojos.pharmacy.Allocating;
import cn.gson.hui_ren_boot.model.service.drug.AllocatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Drug")
public class AllocatingController {

    @Autowired
    AllocatingService allocatingService;

    //根据调拨单号查询详单
    @RequestMapping("allocating-list")
    public List<Allocating> findAllAllocating(String transfersId){
        return allocatingService.findAllAllocating(transfersId);
    }
}
