package cn.gson.hui_ren_boot.model.dao.permissions;

import cn.gson.hui_ren_boot.model.pojos.permissions.Medical;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicalDao extends CrudRepository<Medical,Long> {
}
