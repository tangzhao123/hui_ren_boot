package cn.gson.hui_ren_boot.controller.permissions;

import cn.gson.hui_ren_boot.model.pojos.permissions.Medical;
import cn.gson.hui_ren_boot.model.service.permissions.MedicalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MedicalController {

    @Autowired
    MedicalService medicalService;

    //查询所有的科室列表
    @GetMapping("medical-list")
    public List<Medical> allMedical(){
        return medicalService.allMedical();
    }

    //查询所有的科室列表
    @GetMapping("medicals-list")
    public List<Medical> allMedicals(){
        return medicalService.allMedicals();
    }

    //分页查询所有的科室加模糊查询
    @GetMapping("medical")
    public Object byName(Integer pageNo, Integer size, String medicalName){
        return medicalService.byNameByPage(pageNo, size, medicalName);
    }

    //新增或修改科室
    @RequestMapping("add-medical")
    public String addMedical(@RequestBody Medical medical){
        try {
           medicalService.addMedical(medical);
            return "ok";
        } catch (Exception e) {
            e.printStackTrace();
            return "fail";
        }
    }
}
