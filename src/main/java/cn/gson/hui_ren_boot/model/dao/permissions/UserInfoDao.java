package cn.gson.hui_ren_boot.model.dao.permissions;

import cn.gson.hui_ren_boot.model.pojos.permissions.UserInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoDao extends CrudRepository<UserInfo,Long> {
}
