package cn.gson.hui_ren_boot.controller.pharmacy;

import cn.gson.hui_ren_boot.model.pojos.pharmacy.SendDrug;
import cn.gson.hui_ren_boot.model.service.pharmacy.SendDrugsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sendDrug")
public class SendDrugsController {
    @Autowired
    SendDrugsService sendDrugsService;
    @RequestMapping("send")
    public Object sendByPage(Integer pageNo, Integer size, SendDrug sendDrug){
        return sendDrugsService.sendByPage(pageNo, size, sendDrug);
    }
}
