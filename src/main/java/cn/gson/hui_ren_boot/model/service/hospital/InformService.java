package cn.gson.hui_ren_boot.model.service.hospital;

import cn.gson.hui_ren_boot.model.mapper.hospital.InformMapper;
import cn.gson.hui_ren_boot.model.pojos.hospital.Inform;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class InformService {
    @Autowired
    InformMapper informMapper;
    public void addInform(Inform inform){//新增出院通知
        informMapper.addInform(inform);
    }//新增
    public List<Inform> selectInform(Inform inform){//查出演通知
        return informMapper.selectInform(inform);
    }//病人查询
    public void deleteInform(Inform inform){//删除
        informMapper.deleteInform(inform);
    }//删除
    public Object allInformByPage(Integer pageNo, Integer size,Inform inform){
        return  informMapper.allInform(inform);
    }//模糊查
}
