package cn.gson.hui_ren_boot.controller.drug;

import cn.gson.hui_ren_boot.model.pojos.pharmacy.Transfers;
import cn.gson.hui_ren_boot.model.service.drug.Transfers1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Drug")
public class Transfers1Controller {

    @Autowired
    Transfers1Service transfers1Service;

    //查询所有的调拨申请
    @RequestMapping("transfers1-list")
    public Object findAllTransfers(Integer pageNo,Integer size){
        return transfers1Service.findAllTransfersByPage(pageNo, size);
    }
}
