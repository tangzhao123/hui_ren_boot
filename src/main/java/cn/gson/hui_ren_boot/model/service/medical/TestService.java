package cn.gson.hui_ren_boot.model.service.medical;

import cn.gson.hui_ren_boot.model.dao.medical.TestDao;
import cn.gson.hui_ren_boot.model.dao.medical.TestmiddleDao;
import cn.gson.hui_ren_boot.model.mapper.medical.TestMapper;
import cn.gson.hui_ren_boot.model.mapper.medical.ZhuYuanMapper;
import cn.gson.hui_ren_boot.model.pojos.hospital.InspectDebit;
import cn.gson.hui_ren_boot.model.pojos.medical.*;
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

    @Autowired
    ZhuYuanMapper zhuYuanMapper;//住院检验的mapper

    //查看检验结果
    public List<Combinspection> lookresult(String inspectionPhone){
            return testMapper.lookresult(inspectionPhone);
    }

    //检验后修改状态
    public void payitem(String testAccount){
        if (testAccount != null && testAccount != " "){
            testMapper.payitem(testAccount);
        }
    }

    //新增缴费记录
    public void addDebit(InspectDebit debit){
        if (debit.getDebitId() == 0){
            testMapper.addDebit(debit);
            testMapper.updateDebit(debit.getTestPhone());
        }
    }

    //新增单个项目
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

    //新增套餐里面的项目
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

    //查询预约体检
    public Object selectCmoboByPage(int pageNo, int size, Test test ){
        List<Test> list = testMapper.selectCmobo(test);
        for (Test i: list) {
            System.out.println("haahhhha===："+i);
        }
        return testMapper.selectCmobo(test);
    }
}
