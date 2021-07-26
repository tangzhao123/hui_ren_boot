package cn.gson.hui_ren_boot.controller.hospital;

import cn.gson.hui_ren_boot.model.pojos.hospital.Advice;
import cn.gson.hui_ren_boot.model.pojos.hospital.Details;
import cn.gson.hui_ren_boot.model.service.hospital.DetailsService;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/addDetails")
public class DetailsController {//医嘱详情
    @Autowired
    DetailsService detailsService;
    @RequestMapping("/seletdetails")
    public Object  seletDetails(Integer pageNo,Integer size,Details details){//医嘱详情管理
        return detailsService.seletDetailsByPage(pageNo,size,details.getAdviceId());
    }

}

