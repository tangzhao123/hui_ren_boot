package cn.gson.hui_ren_boot.controller.permissions;

import cn.gson.hui_ren_boot.model.service.permissions.FunctionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunctionController {

    @Autowired
    FunctionService functionService;

    //分页加模糊查询
    @RequestMapping("function-list")
    public Object findAllFunction(Integer pageNo,Integer size,String search){
        return functionService.findAllFunctionByPage(pageNo, size, search);
    }
}
