package cn.gson.hui_ren_boot.controller.drug;



import cn.gson.hui_ren_boot.model.pojos.permissions.CheckInfo;
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
        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");
        String newDate=sdf.format(new Date());
        String result="";
        String str = "XHXQ";
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
            List<Destruction> lists = new ArrayList<>();
            for (Destruction d : list) {
                if(d.getDeInventoryNote().equals("盘盈")){
                    drugStockService.updateDrugStock1(d.getDeSum(),d.getDeBatch());
                }else{
                    lists.add(d);
                }
            }
            disposeApplyService.addDisposeApply(disposeApply,lists);

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
    public String updateDisposeApply(@RequestBody CheckInfo checkInfo){
        try {
            disposeApplyService.updateDisposeApply(checkInfo);
            return "ok";
        } catch (Exception e) {
            e.printStackTrace();
            return "fail";
        }

    }

    //审批销毁申请
    @RequestMapping("update-disposeApply1")
    public String updateDisposeApply1(@RequestBody CheckInfo checkInfo){
        try {
            disposeApplyService.updateDisposeApply1(checkInfo);
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

    //查询所有药品库存
    @RequestMapping("stockList")
    public Object findAllDrugStock(Integer pageNo,Integer size,String search,Long typeId){
        return drugStockService.findAllDrugStockByPage(pageNo, size,search,typeId);
    }

    //查询所有的药品拆零记录
    @RequestMapping("findAllScattered")
    public Object allScattered(Integer pageNo,Integer size){
        return drugStockService.allScatteredByPage(pageNo,size);
    }

}
