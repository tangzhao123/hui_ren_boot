package cn.gson.hui_ren_boot.controller.hospital;

import cn.gson.hui_ren_boot.model.pojos.hospital.Advice;
import cn.gson.hui_ren_boot.model.pojos.hospital.Blockup;
import cn.gson.hui_ren_boot.model.pojos.hospital.Details;
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


    //新增修改
    @RequestMapping("/blockuptj")//医嘱管理
    private String blockupTj(@RequestBody Blockup blockup,String advicewId){
        //查询详单号
        System.out.println(blockup);
        System.out.println(advicewId);
     List<Details> Jh=detailsService.queryDeta(advicewId);
        for (Details h:Jh) {

            blockup.setDetailsMark(h.getDaralisMark());
            blockupService.addBlock(blockup);//添加记录

            detailsService.upDetails(h.getAdviceId());//主表停嘱
        }
        return "ok";
    }
    @RequestMapping("/blockupcs")//医嘱管理
    private String blockupc(@RequestBody Blockup blockup){
        detailsService.upDetailw(blockup.getDetailsMark());//从表停嘱
        blockupService.addBlock(blockup);//添加记录
        return "ok";
    }
}
