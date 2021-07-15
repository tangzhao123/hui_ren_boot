package cn.gson.hui_ren_boot.model.dao.medical;

import cn.gson.hui_ren_boot.model.mapper.medical.ComboitemMapper;
import cn.gson.hui_ren_boot.model.pojos.medical.Comboitem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComboitemDao extends CrudRepository<Comboitem,Long> {
}
