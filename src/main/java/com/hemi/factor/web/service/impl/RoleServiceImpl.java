package com.hemi.factor.web.service.impl;

import com.hemi.factor.core.generic.GenericDao;
import com.hemi.factor.core.generic.GenericServiceImpl;
import com.hemi.factor.web.dao.SysRoleMapper;
import com.hemi.factor.web.model.SysRole;
import com.hemi.factor.web.service.RoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Vanguard on 2016/12/20.
 */
@Service
public class RoleServiceImpl extends GenericServiceImpl<SysRole,String> implements RoleService{

    @Resource
    private SysRoleMapper roleMapper;

    @Override
    public GenericDao<SysRole, String> getDao() {
        return roleMapper;
    }

    /**
     * 根据用户Id 查询角色
     * @param userId
     * @return
     */
    @Override
    public List<SysRole> selectRolesByUserId(String userId) {
        return roleMapper.selectRolesByUserId(userId);
    }
}
