package cn.gson.hui_ren_boot.controller.pharmacy;

import cn.gson.hui_ren_boot.model.pojos.pharmacy.DisposeApply;
import cn.gson.hui_ren_boot.model.service.pharmacy.DisposesApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("disposeApply")
public class DisposeApplyController {
    @Autowired
    DisposesApplyService disposesApplyService;
    @RequestMapping("dispose")
    public Object disposeByPage(@RequestBody DisposeApply disposeApply){
        return disposesApplyService.disposeByPage(disposeApply.getPageNo(),disposeApply.getSize(),disposeApply.getApplyNum(),
                disposeApply.getApplyBatch(),disposeApply.getDrugName());
    }
}
