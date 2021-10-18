package cn.gson.hui_ren_boot.model.service.medical;

import cn.gson.hui_ren_boot.model.dao.medical.TestDao;
import cn.gson.hui_ren_boot.model.dao.medical.TestmiddleDao;
import cn.gson.hui_ren_boot.model.mapper.medical.TestMapper;
import cn.gson.hui_ren_boot.model.pojos.medical.Cmobo;
import cn.gson.hui_ren_boot.model.pojos.medical.Comboitem;
import cn.gson.hui_ren_boot.model.pojos.medical.Test;
import cn.gson.hui_ren_boot.model.pojos.medical.Testmiddle;
import cn.gson.hui_ren_boot.utils.MyUtil;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {
    @Autowired
    TestMapper testMapper;//预约体检


    @Autowired
    TestmiddleDao testmiddleDao;//中间表的dao成

    @Autowired
    CmoboSerivice cmoboSerivice;//套餐

    public void allItem(List<Object> list,String id){
        ObjectMapper mapper = new ObjectMapper();
        //选择的单个项目
        if (list != null){
            for (Object o: list) {
                Comboitem c = mapper.convertValue(o,Comboitem.class);
                System.out.println("选择单个项目："+c.toString());
                Testmiddle testmiddle = new Testmiddle();
                testmiddle.setTestAccount(id);//体检单号
                testmiddle.setItemId(c.getItemId());
                testMapper.addMiddle(testmiddle);
            }
        }

    }

    public void allCmob(List<Object> list1,String id){
        ObjectMapper mapper = new ObjectMapper();
        //选择的套餐
        if (list1 != null){
            for (Object p: list1){
                Cmobo m = mapper.convertValue(p,Cmobo.class);//转化成套餐的类
                System.out.println("转化后套餐的内容："+ m.toString());
                List<Comboitem> comboitems = cmoboSerivice.selectAll(m.getComboSerial());//查询套餐包含的项目
                for (Comboitem s: comboitems) {
                    Comboitem c1 = mapper.convertValue(s,Comboitem.class);
                    System.out.println("套餐包含的项目"+ c1.toString());
                    Testmiddle testmiddles = new Testmiddle();
                    testmiddles.setTestAccount(id);//体检单号
                    testmiddles.setItemId(c1.getItemId());//项目编号
                    testMapper.addMiddles(testmiddles);
                }
            }
        }
    }



    //取消预约修改状态
    public void dels (String account){
        if (account != null && account != " "){
            testMapper.updateYuyue(account);
        }
    }

    //新增
    public void insertTest(Test test){
        if (test.getTestId() == 0){
            testMapper.insertTest(test);
        }

    }

    public Object selectCmoboByPage(int pageNo, int size, Test test ){
        return testMapper.selectCmobo(test);
    }
}
