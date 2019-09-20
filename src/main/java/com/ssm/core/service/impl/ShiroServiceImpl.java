package com.ssm.core.service.impl;

import com.ssm.common.utils.StringUtils;
import com.ssm.core.dao.IShiroDAO;
import com.ssm.core.entity.User;
import com.ssm.core.service.IShiroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Joseph.L
 * @date 2019-09-03
 * @description
 */
@Service
public class ShiroServiceImpl implements IShiroService {

    @Autowired
    private IShiroDAO shiroDAO;

    @Override
    public User getUserByUserName(String userName) {
        if (StringUtils.isEmpty(userName)) {
            return null;
        }
        return shiroDAO.getUserByUserName(userName);
    }

    @Override
    public List<String> getUserRolesByUserCode(String userCode) {
        if (StringUtils.isEmpty(userCode)) {
            return null;
        }
        return shiroDAO.getUserRolesByUserCode(userCode);
    }

    @Override
    public List<String> getRolePermissionsByRoleCode(String roleCode) {
        if (StringUtils.isEmpty(roleCode)) {
            return null;
        }
        return shiroDAO.getRolePermissionsByRoleCode(roleCode);
    }
}
