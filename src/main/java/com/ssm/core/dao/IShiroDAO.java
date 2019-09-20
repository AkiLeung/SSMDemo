package com.ssm.core.dao;

import com.ssm.core.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 功能說明：用戶 DAO
 *
 * @author Joseph.L
 * @version 2019-09-03
 */
@Repository
public interface IShiroDAO {

    /**
     * 只查询一个
     *
     * @param userName
     * @return User
     */
    User getUserByUserName(String userName);

    /**
     * 按用户账号查询所有的角色
     *
     * @param userCode
     * @return List<String>
     */
    List<String> getUserRolesByUserCode(String userCode);

    /**
     * 按用户账号查询所有的权限
     *
     * @param roleCode
     * @return List<String>
     */
    List<String> getRolePermissionsByRoleCode(String roleCode);
}
