package cn.gson.hui_ren_boot.controller.nursestation;

import cn.gson.hui_ren_boot.model.pojos.hospital.Advice;
import cn.gson.hui_ren_boot.model.pojos.hospital.Details;
import cn.gson.hui_ren_boot.model.pojos.hospital.Record;
import cn.gson.hui_ren_boot.model.pojos.nursestation.Orders;
import cn.gson.hui_ren_boot.model.pojos.nursestation.Prndebit;
import cn.gson.hui_ren_boot.model.pojos.outpatient.TreatmentCard;
import cn.gson.hui_ren_boot.model.pojos.permissions.Staff;
import cn.gson.hui_ren_boot.model.service.nursestation.OrdersService;
import cn.gson.hui_ren_boot.model.service.nursestation.PrndebitService;
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

    @Autowired
    PrndebitService prndebitService;//扣费记录（诊疗卡）


    //医嘱表连接详表
    @GetMapping("/details-all")
    public List<Advice> selAll(String registerId){
        System.out.println("医嘱号："+registerId);
        return ordersService.selAll(registerId);
    }

    //新增执行记录
    @RequestMapping("/insert-orders")
    public String zhixing(@RequestBody Map<String,Object> map){
        System.out.println("==========open================");
        ObjectMapper mapper = new ObjectMapper();
        String name = (String)map.get("user");//执行人员
        System.out.println("登陆人员："+name);

        String card = (String)map.get("card");//诊疗卡号
        System.out.println("诊疗卡号："+card);

        String huanzhe = (String) map.get("names");//患者名
        System.out.println("患者："+huanzhe);

        Long money = Long.valueOf(0);//记录费用

        Prndebit prndebit = new Prndebit();//医嘱执行记录扣费
        prndebit.setPrndebitUser(name);//执行人
        prndebit.setRegisterName(huanzhe);//患者

        List<TreatmentCard> treatmentCards = prndebitService.selectCard(card);//查询诊疗卡的余额
        System.out.println("000000000000:"+treatmentCards.get(0).getTreatmentBalance());
        List<Object> list = (List<Object>)map.get("details");
        for (Object i: list) {
            Details details = mapper.convertValue(i,Details.class);//医嘱详情
            money += details.getDaralisPrice();//记录使用的费用
            Orders orders = new Orders();//执行记录
            String xiang = MyUtil.genrateNo("ZXYZ");//执行医嘱号
            orders.setOrdersId(xiang);
            orders.setOrdersUser(name);//执行人
            orders.setOrdersSerial(details.getDaralisPrice());//费用
            orders.setOrderDetails(details.getDaralisMark());//医嘱详单单号
            ordersService.insertOrders(orders);//新增执行医嘱记录

            prndebit.setRegisterId(details.getRegisterId());//住院号
            prndebit.setAdviceId(details.getAdviceId());//医嘱号
        }
        prndebit.setPrndebitSum(money);//扣费总额
        System.out.println("总价格2="+money);
        System.out.println("记录"+prndebit);
        prndebitService.addPrndebit(prndebit);//新增扣费记录

        Long money2 = treatmentCards.get(0).getTreatmentBalance() - money;
        System.out.println("剩余："+money2);

        prndebitService.updateCard(money2,card);

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
        System.out.println("医嘱："+ordersService.selectAdvice(registerId));
        return ordersService.selectAdvice(registerId);
    }

    //查询病人
    @GetMapping("/all-order")
    public List<Record> allBing(){
//        System.out.println("================="+ordersService.allBing());
        return ordersService.allBing();
    }
}
