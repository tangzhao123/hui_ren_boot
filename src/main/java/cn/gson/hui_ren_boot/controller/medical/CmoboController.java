package cn.gson.hui_ren_boot.controller.medical;

import cn.gson.hui_ren_boot.model.pojos.medical.Cmobo;
import cn.gson.hui_ren_boot.model.pojos.medical.Comboitem;
import cn.gson.hui_ren_boot.model.pojos.medical.Combomiddle;
import cn.gson.hui_ren_boot.model.service.medical.CmoboSerivice;
import cn.gson.hui_ren_boot.model.service.medical.ComboitemService;
import cn.gson.hui_ren_boot.utils.MyUtil;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;
import java.util.Map;

@RestController
public class CmoboController {

    @Autowired
    CmoboSerivice cmoboSerivice;

    @Autowired
    ComboitemService comboitemService;

    //查询套餐里面的项目
    @GetMapping("select-All")
    public List<Comboitem> selectAll(String comboSerial){
//        System.out.println("套餐编号："+comboSerial);
        return cmoboSerivice.selectAll(comboSerial);
    }

    //新增套餐表
    @RequestMapping("/cmobos-middle")
    public String xinzeng(@RequestBody Map<String,Object> map){
        try {
            ObjectMapper mapper = new ObjectMapper();
            Cmobo c = mapper.convertValue(map.get("cmobo"),Cmobo.class);//套餐类
            String serial = MyUtil.genrateNo("TC");//体检套餐序号
            c.setComboSerial(serial);
            if (c.getComboId() == 0){
                Combomiddle combomiddle = new Combomiddle();//中间表
                //拿到选中的项目的编号
                String idss = map.get("idss").toString();
                System.out.println("选择的项目："+idss);
                String str[] = idss.split(",");
                Long money = Long.valueOf(0);
                for (String s: str) {
                    if (s != null && !s.equals("") ){
                        int o = Integer.valueOf(s);
                        combomiddle.setComboSerial(serial);
                        combomiddle.setItemId(o);
                        List<Comboitem> selecitem = comboitemService.selecitem(Long.valueOf(s));
                        for (Comboitem cc: selecitem) {
                            System.out.println("价格："+cc.getItemMoney());
                            money += cc.getItemMoney();
                        }
                        cmoboSerivice.addMiddle(combomiddle);
                    }
                    c.setComboMoney(money);
                }
                cmoboSerivice.addCmobo(c);//新增套餐
            }
            System.out.println("套餐名称："+c.toString());
            return "ok";
        }catch (Exception e) {
            e.printStackTrace();
            return "fail";
        }

    }

    //查询体检套餐
    @GetMapping("/cmobo-select")
    public Object seeCmobo(String cmoboss){
        Cmobo c = JSONObject.parseObject(cmoboss,Cmobo.class);
        return cmoboSerivice.seeCmoboByPage(c);
    }

    //查询体检项目
    @GetMapping("/comboitem-all")
    public List<Comboitem> allComboitem(){
        return cmoboSerivice.allComboitem();
    }
}
