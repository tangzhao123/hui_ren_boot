package cn.gson.hui_ren_boot.model.service.medical;

import cn.gson.hui_ren_boot.model.dao.medical.TestDao;
import cn.gson.hui_ren_boot.model.mapper.medical.TestMapper;
import cn.gson.hui_ren_boot.model.pojos.medical.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {
    @Autowired
    TestMapper testMapper;//预约体检

    @Autowired
    TestDao testDao;//体检预约Dao

    //删除
    public void delTest(Long id){
        testDao.deleteById(id);
    }

    //修改预约体检
    public void addTest(Test test){
        testDao.save(test);
    }
    //新增
    public void insertTest(Test test){
        testMapper.insertTest(test);
    }

    public Object selectCmoboByPage(int pageNo, int size, String testName){
        return testMapper.selectCmobo(testName);
    }
}
