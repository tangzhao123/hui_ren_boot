package cn.gson.hui_ren_boot.controller.pharmacy;

import cn.gson.hui_ren_boot.model.pojos.pharmacy.Transfers;
import cn.gson.hui_ren_boot.model.service.pharmacy.TransfersService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/DrugTransfers")
public class TransfersController {
    @Autowired
    TransfersService transfersService;
   //分页模糊查询
    @RequestMapping("/transfers")
    public Object allTransfers(@RequestBody Transfers transfers){
        return transfersService.allTransfersByPage(transfers.getPageNo(),transfers.getSize(),
                transfers.getTransfersId(),transfers.getDrugName());
    }
    @RequestMapping("/addTransfers")
    public String addTransfers(@RequestBody Transfers drugTransfers){
      try{
           transfersService.addTransfers(drugTransfers);
        System.out.println("zy");
        System.out.println(drugTransfers);
            return "ok";
      }catch (Exception e){
            e.printStackTrace();
            return "fail";
        }
    }

}
