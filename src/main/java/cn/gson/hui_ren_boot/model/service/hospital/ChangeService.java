package cn.gson.hui_ren_boot.model.service.hospital;

import cn.gson.hui_ren_boot.model.mapper.hospital.ChangeMapper;
import cn.gson.hui_ren_boot.model.pojos.hospital.Change;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ChangeService {
    @Autowired
    ChangeMapper changeMapper;
    public void addChange(Change change){//添加
        changeMapper.addChange(change);
    }
    public List<Change> allChange(){//查询
        return changeMapper.allChange();
    }
    //删除
    public void deChange(Change change){
         changeMapper.deChange(change); ;
     }
}
