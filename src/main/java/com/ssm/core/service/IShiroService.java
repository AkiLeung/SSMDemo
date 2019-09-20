package com.ssm.core.service;

import com.ssm.core.entity.User;

import java.util.List;

/**
 * 功能说明：用戶接口
 *
 * @author Joseph
 * @date 20190904
 */
public interface IShiroService {

    /**
     * 根据用户名查找用户
     *
     * @param userName
     * @return
     */
    User getUserByUserName(String userName);


    /**
     * 根据用户名查找用户
     *
     * @param userCode
     * @return
     */
    List<String> getUserRolesByUserCode(String userCode);


    /**
     * 根据角色名查找权限
     *
     * @param roleCode
     * @return
     */
    List<String> getRolePermissionsByRoleCode(String roleCode);
}
