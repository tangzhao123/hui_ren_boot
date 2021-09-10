package cn.gson.hui_ren_boot.controller.pharmacy;

import cn.gson.hui_ren_boot.model.pojos.pharmacy.Allocating;
import cn.gson.hui_ren_boot.model.service.pharmacy.AllocatingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("add")
public class AlloctingsController {
    @Autowired
    AllocatingsService allocatingService;

    @RequestMapping("allocating")
    public String addAllocating(Allocating allocating){
        try{
            allocatingService.AddAllocating(allocating);
            return "ok";
        }catch (Exception e){
            return "fail";
        }
    }
}
