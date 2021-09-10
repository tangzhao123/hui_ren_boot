package cn.gson.hui_ren_boot.controller.drug;



import cn.gson.hui_ren_boot.model.pojos.pharmacy.Destruction;
import cn.gson.hui_ren_boot.model.pojos.pharmacy.DisposeApply;
import cn.gson.hui_ren_boot.model.pojos.pharmacy.DrugStock;
import cn.gson.hui_ren_boot.model.service.drug.DisposeApplyService;
import cn.gson.hui_ren_boot.model.service.drug.DrugCheckService;
import cn.gson.hui_ren_boot.model.service.drug.DrugStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;


@RestController
@RequestMapping("/Drug")
public class DrugStockController {

    @Autowired
    DrugStockService drugStockService;

    @Autowired
    DisposeApplyService disposeApplyService;

    @Autowired
    DrugCheckService drugCheckService;

    //生成随机单号
    public static String getOrderIdByTime() {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmss");
        String newDate=sdf.format(new Date());
        String result="";
        String str = "XHSQ";
        Random random=new Random();
        for(int i=0;i<3;i++){
            result+=random.nextInt(10);
        }
        return str+newDate+result;
    }

    //查询临期库存药品
    @RequestMapping("period-list")
    public Object findAllPeriod(Integer pageNo,Integer size){
        List<String> destructionList = disposeApplyService.findAllDestruction();
        return drugStockService.findAllPeriodByPage(pageNo,size,destructionList);
    }

    //新增销毁申请表
    @RequestMapping("add-disposeApply")
    public String addDisposeApply(@RequestBody DisposeApply disposeApply){
        System.out.println(disposeApply);
        try {
          List<Destruction> list = disposeApply.getDisposeApplyData();
            for (Destruction d : list) {
                d.setDeId(getOrderIdByTime());
            }
            if(""!=disposeApply.getCheckNo() && null != disposeApply.getCheckNo()){
                drugCheckService.updateCheckGo(disposeApply.getApplyNum(),disposeApply.getCheckNo());
            }
            disposeApplyService.addDisposeApply(disposeApply);
            return "ok";
        } catch (Exception e) {
            e.printStackTrace();
            return "fail";
        }
    }

    //查询所有未审批的销毁申请单
    @RequestMapping("disposeApply-list")
    public Object findAllDisposeApply(Integer pageNo,Integer size){
        return disposeApplyService.findAllDisposeApplyByPage(pageNo, size);
    }

    //审批销毁申请
    @RequestMapping("update-disposeApply")
    public String updateDisposeApply(Long applyApproval, String applyNum){
        try {
            disposeApplyService.updateDisposeApply(applyApproval, applyNum);
            return "ok";
        } catch (Exception e) {
            e.printStackTrace();
            return "fail";
        }

    }

    //根据销毁申请单号查询详单
    @RequestMapping("destruction-list")
    public List<Destruction> allDestruction(String applyId){
        return disposeApplyService.allDestruction(applyId);
    }

    //根据药品类别查询库存
    @RequestMapping("all-drugStock-list")
    public List<DrugStock> allDrugStock(Long typeId){
        return drugStockService.allDrugStock(typeId);
    }

    //查询所有已经审批的销毁申请
    @RequestMapping("allDisposeApply-list")
    public Object allDisposeApply(Integer pageNo,Integer size){
        return disposeApplyService.allDisposeApplyByPage(pageNo,size);
    }
}