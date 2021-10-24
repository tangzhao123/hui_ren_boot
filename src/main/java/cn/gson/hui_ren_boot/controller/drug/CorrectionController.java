package cn.gson.hui_ren_boot.controller.drug;

import cn.gson.hui_ren_boot.model.pojos.pharmacy.Correction;
import cn.gson.hui_ren_boot.model.service.drug.CorrectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.List;

@RestController
@RequestMapping("/Drug")
public class CorrectionController {

    @Autowired
    CorrectionService correctionService;

    //查询所有的库存修正记录
    @RequestMapping("correction-list")
    public List<Correction> findAllCorrection(@RequestBody Correction correction){
        String start = null;
        String end = null;
        if (correction.getStr() != null && correction.getStr1() != null) {
            SimpleDateFormat sf = new SimpleDateFormat("yyy-MM-dd");
            start = sf.format(correction.getStr());
            end = sf.format(correction.getStr1());
        }
        return correctionService.findAllCorrection(start,end,correction.getSearch());
    }
}
