package cn.gson.hui_ren_boot.controller.medical;

import cn.gson.hui_ren_boot.model.pojos.medical.Cmobo;
import cn.gson.hui_ren_boot.model.pojos.medical.Comboitem;
import cn.gson.hui_ren_boot.model.pojos.medical.Combomiddle;
import cn.gson.hui_ren_boot.model.service.medical.CmoboSerivice;
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
public class CmoboController {

    @Autowired
    CmoboSerivice cmoboSerivice;

    //查询套餐里面的项目
    @GetMapping("select-All")
    public List<Comboitem> selectAll(String comboSerial){
        System.out.println("套餐编号："+comboSerial);
        return cmoboSerivice.selectAll(comboSerial);
    }

    //新增套餐表
    @RequestMapping("/cmobos-middle")
    public String xinzeng(@RequestBody Map<String,Object> map){
        System.out.println("=========open========");
        ObjectMapper mapper = new ObjectMapper();
        Cmobo c = mapper.convertValue(map.get("cmobo"),Cmobo.class);//套餐类
        String serial = MyUtil.genrateNo("TC");//体检套餐序号
        c.setComboSerial(serial);
//        System.out.println("hahaha==="+c.getComboSerial());
//        System.out.println("mingzi==="+c.getComboName());
        Combomiddle combomiddle = new Combomiddle();//中间表
        //拿到选中的项目的编号
        String idss = map.get("idss").toString();
        String str[] = idss.split(",");
        for (String s: str) {
            if (s != null && !s.equals("") ){
                int o = Integer.valueOf(s);
                combomiddle.setComboSerial(serial);
                combomiddle.setItemId(Integer.valueOf(s));
//                System.out.println("项目编号："+o);
                cmoboSerivice.addMiddle(combomiddle);
            }
        }
        cmoboSerivice.addCmobo(c);

        return "ok";
    }

    //查询体检套餐
    @GetMapping("/cmobo-select")
    public List<Cmobo> seeCmobo(){
//        System.out.println("套餐===="+cmoboSerivice.seeCmobo());
        return cmoboSerivice.seeCmobo();
    }

    //查询体检项目
    @GetMapping("/comboitem-all")
    public List<Comboitem> allComboitem(){
//        System.out.println("项目========"+cmoboSerivice.allComboitem());
        return cmoboSerivice.allComboitem();
    }
}
