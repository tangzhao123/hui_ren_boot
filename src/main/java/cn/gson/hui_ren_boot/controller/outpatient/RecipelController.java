package cn.gson.hui_ren_boot.controller.outpatient;

import cn.gson.hui_ren_boot.model.pojos.outpatient.PrescriptionDetail;
import cn.gson.hui_ren_boot.model.pojos.outpatient.PrescriptionList;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 门诊开处方
 */
@RestController
@RequestMapping("/outpatient")
public class RecipelController {
    @RequestMapping("/add-recipel")
    public void addRecipel(@RequestBody PrescriptionList prescriptionList){
        List<PrescriptionDetail> details = prescriptionList.getDetails();
        for (PrescriptionDetail detail : details) {
            System.out.println(detail);
        }
        System.out.println(prescriptionList);
    }
}
