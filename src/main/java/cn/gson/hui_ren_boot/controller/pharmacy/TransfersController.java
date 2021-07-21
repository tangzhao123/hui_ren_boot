package cn.gson.hui_ren_boot.controller.pharmacy;

import cn.gson.hui_ren_boot.model.pojos.pharmacy.Transfers;
import cn.gson.hui_ren_boot.model.service.pharmacy.TransfersService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/DrugTransfers")
public class TransfersController {
    @Autowired
    TransfersService transfersService;
   //分页
    @RequestMapping("/transfers")
    public Object allTransfers(Integer pageNo,Integer size,String transfers){
        Transfers transferse= JSONObject.toJavaObject(JSON.parseObject(transfers),Transfers.class);

        return transfersService.allTransfersByPage(pageNo,size,transferse);

    }

}
