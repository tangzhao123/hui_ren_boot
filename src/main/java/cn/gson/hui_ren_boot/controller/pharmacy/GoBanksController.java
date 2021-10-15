package cn.gson.hui_ren_boot.controller.pharmacy;


import cn.gson.hui_ren_boot.model.pojos.pharmacy.GoBank;
import cn.gson.hui_ren_boot.model.service.pharmacy.GoBanksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("GoBank")
public class GoBanksController {
    @Autowired
    GoBanksService goBankService;

    @RequestMapping("bank")
    public Object goBankByPage(@RequestBody GoBank goBank){
        return goBankService.goBankByPage(goBank.getPageNo(),goBank.getSize(),goBank.getGoNum(),goBank.getGoBatch(),goBank.getDrugName());
    }
}
