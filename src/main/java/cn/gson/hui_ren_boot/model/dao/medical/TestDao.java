package cn.gson.hui_ren_boot.model.dao.medical;

import cn.gson.hui_ren_boot.model.pojos.medical.Test;
import org.springframework.data.repository.CrudRepository;

public interface TestDao extends CrudRepository<Test,Long> {
}
