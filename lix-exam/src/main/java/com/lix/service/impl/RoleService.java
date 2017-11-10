package com.lix.service.impl;

import com.lix.entity.Role;
import com.lix.mapper.RoleMapper;
import com.lix.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("roleService")
public class RoleService implements IRoleService {
    @Autowired
    private RoleMapper roleMapper;

    public Role findByid(Integer roleId) {
        return roleMapper.selectByPrimaryKey(roleId);
    }
}
