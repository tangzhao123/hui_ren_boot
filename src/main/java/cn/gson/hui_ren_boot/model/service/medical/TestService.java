package cn.gson.hui_ren_boot.model.service.medical;

import cn.gson.hui_ren_boot.model.dao.medical.TestDao;
import cn.gson.hui_ren_boot.model.dao.medical.TestmiddleDao;
import cn.gson.hui_ren_boot.model.mapper.medical.TestMapper;
import cn.gson.hui_ren_boot.model.pojos.medical.Test;
import cn.gson.hui_ren_boot.model.pojos.medical.Testmiddle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {
    @Autowired
    TestMapper testMapper;//预约体检

    @Autowired
    TestDao testDao;//体检预约Dao

    @Autowired
    TestmiddleDao testmiddleDao;//中间表的dao成

    //新增体检中间表
    public void addMiddle(Testmiddle testmiddle){
        testMapper.addMiddle(testmiddle);
    }

    //新增
    public void insertMiddle(Testmiddle testmiddle){
        testmiddleDao.save(testmiddle);
    }

    //删除
    public void dels (Long testId){
        testMapper.dels(testId);
    }

    //修改预约体检
    public void addTest(Test test){
        testDao.save(test);
    }
    //新增
    public void insertTest(Test test){
        testMapper.insertTest(test);
    }

    public Object selectCmoboByPage(int pageNo, int size, Test test ){
        return testMapper.selectCmobo(test);
    }
}
