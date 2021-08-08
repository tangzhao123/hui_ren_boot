package cn.gson.hui_ren_boot.controller.nursestation;

import cn.gson.hui_ren_boot.model.pojos.hospital.Advice;
import cn.gson.hui_ren_boot.model.pojos.hospital.Details;
import cn.gson.hui_ren_boot.model.pojos.hospital.Record;
import cn.gson.hui_ren_boot.model.service.nursestation.OrdersService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class OrdersController {
    @Autowired
    OrdersService ordersService;

    //新增执行记录
    @RequestMapping("/insert-orders")
    public String zhixing(@RequestBody Map<String,Object> map){
        System.out.println("==========open================");
        ObjectMapper mapper = new ObjectMapper();
        Object details = map.get("details");

        System.out.println("hhhhh="+details);


        return "ok";
    }

    //医嘱详情
    @GetMapping("/details-select")
    public List<Details> selectDetails(String adviceId){
//        System.out.println("医嘱号"+adviceId);
        return ordersService.selectDetails(adviceId);
    }

    //查询医嘱
    @GetMapping("/advice-select")
    public List<Advice> selectAdvice(String registerId){
//        System.out.println("住院号==="+registerId);
        return ordersService.selectAdvice(registerId);
    }

    //查询病人
    @GetMapping("/all-order")
    public List<Record> allBing(){
//        System.out.println("================="+ordersService.allBing());
        return ordersService.allBing();
    }
}