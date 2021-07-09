package cn.gson.hui_ren_boot.model.mapper.hospital;

import cn.gson.hui_ren_boot.model.pojos.hospital.Register;
import org.springframework.data.repository.CrudRepository;

public interface RegisterDao extends CrudRepository<Register,Long> {
}
