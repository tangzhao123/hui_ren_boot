package cn.gson.hui_ren_boot.controller.hospital;

import cn.gson.hui_ren_boot.model.pojos.hospital.Advice;
import cn.gson.hui_ren_boot.model.pojos.hospital.Blockup;
import cn.gson.hui_ren_boot.model.pojos.hospital.Details;
import cn.gson.hui_ren_boot.model.pojos.medical.Combinspection;
import cn.gson.hui_ren_boot.model.pojos.medical.Test;

import cn.gson.hui_ren_boot.model.service.hospital.AdviceService;
import cn.gson.hui_ren_boot.model.service.hospital.BlockupService;
import cn.gson.hui_ren_boot.model.service.hospital.DetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Blockd")
public class BlockupController {
    @Autowired
    BlockupService blockupService;
    @Autowired
    DetailsService detailsService;
    @Autowired
    AdviceService adviceService;

    //新增修改
    @RequestMapping("/blockuptj")//医嘱管理
    private String blockupTj(@RequestBody Blockup blockup){
        //查询详单号
        try{
            List<Details> Jh=detailsService.queryDeta(blockup.getAdviceId());//按照医嘱号查询详单号
            Details adv=new Details();
            Advice a=new Advice();
            for (Details h:Jh) {//循环查询出来集合
                if(h.getDaralisDstate()==1){//主表停嘱让状态为1进sql语句
                    blockup.setDetailsMark(h.getDaralisMark());//把详表的详单号赋值给记录表
                    blockupService.addBlock(blockup);//添加记录
                    adv.setAdviceId(blockup.getAdviceId());
                    adv.setDaralisDisable(blockup.getBlockupDate());
                    detailsService.upDetails(adv);//主表停嘱
                    a.setAdviceId(blockup.getAdviceId());
                    a.setAdviceEnd(blockup.getBlockupDate());
                    adviceService.assAdvice(a);
                }
            }
            return "ok";
        }catch(Exception e){
            return "fail";
        }


    }
    @RequestMapping("/blockupcs")//医嘱管理
    private String blockupc(@RequestBody Blockup blockup){
        try{
            System.out.println(blockup);
            Details k=new Details();
            k.setDaralisDisable(blockup.getBlockupDate());
            k.setDaralisMark(blockup.getDetailsMark());
            detailsService.upDetailw(k);//从表停嘱
            blockupService.addBlock(blockup);//添加记录
            return "ok";
        }catch(Exception e){
            return "fail";
        }
    }
    @RequestMapping("/addtest")
    private String addTests(@RequestBody Test test){
          try{
              blockupService.addTest(test);
              return "ok";
          }catch(Exception e){
            return "fail";
        }


    }
    @RequestMapping("/seltext")
    private List<Test> selte(@RequestBody Test test){//查询体检单
       return blockupService.selText(test);
    }
    @RequestMapping("ahhResults")
    private List<Combinspection>allResults(@RequestBody Combinspection combinspection){//查询检验结果
        return  blockupService.allResults(combinspection);
    }
}
