package cn.gson.hui_ren_boot.controller.hospital;

import cn.gson.hui_ren_boot.model.pojos.hospital.Casefile;
import cn.gson.hui_ren_boot.model.service.hospital.CasefileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Case")
public class CasefileContorller {
    @Autowired
    CasefileService casefileService;
    @RequestMapping("/caset")
    public String addCaset(@RequestBody Casefile casefile){
        System.out.println(casefile);
        casefileService.addCasefie(casefile);
        return "ok";
    }
    @RequestMapping("/seCase")
    public List<Casefile>selectCasefile(@RequestBody Casefile casefie){
        return casefileService.selectCasefile(casefie);
    }
}
