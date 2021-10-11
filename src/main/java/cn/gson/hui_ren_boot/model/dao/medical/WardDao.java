package cn.gson.hui_ren_boot.model.dao.medical;


import cn.gson.hui_ren_boot.model.pojos.hospital.Ward;
import org.springframework.data.repository.CrudRepository;

public interface WardDao extends CrudRepository<Ward, Long> {
}
