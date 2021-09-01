package cn.gson.hui_ren_boot.controller.nursestation;

import cn.gson.hui_ren_boot.model.pojos.hospital.Advice;
import cn.gson.hui_ren_boot.model.pojos.hospital.Details;
import cn.gson.hui_ren_boot.model.pojos.hospital.Record;
import cn.gson.hui_ren_boot.model.pojos.nursestation.Orders;
import cn.gson.hui_ren_boot.model.service.nursestation.OrdersService;
import cn.gson.hui_ren_boot.utils.MyUtil;
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

    @GetMapping("/details-all")
    public List<Details> selAll(String registerId){
        System.out.println("著员工好"+registerId);

        return ordersService.selAll(registerId);
    }

    //新增执行记录
    @RequestMapping("/insert-orders")
    public String zhixing(@RequestBody Map<String,Object> map){
        System.out.println("==========open================");
        ObjectMapper mapper = new ObjectMapper();
        List<Object> list = (List<Object>)map.get("details");
        for (Object i: list) {
            Details details = mapper.convertValue(i,Details.class);
//            System.out.println("价格=="+details.getDaralisPrice());
            Orders orders = new Orders();//执行记录
            orders.setOrdersUser(Long.valueOf(2));
            orders.setOrderDetails(Long.valueOf(2));
            String xiang = MyUtil.genrateNo("ZX");
            orders.setOrdersId(xiang);
            ordersService.insertOrders(orders);//新增执行
//            ordersService.updateOrder(details.getDaralisMark());//修改详情
        }


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
        return ordersService.selectAdvice(registerId);
    }

    //查询病人
    @GetMapping("/all-order")
    public List<Record> allBing(){
//        System.out.println("================="+ordersService.allBing());
        return ordersService.allBing();
    }
}
