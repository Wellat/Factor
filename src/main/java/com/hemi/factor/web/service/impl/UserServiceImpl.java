package com.hemi.factor.web.service.impl;

import com.hemi.factor.core.generic.GenericDao;
import com.hemi.factor.core.generic.GenericServiceImpl;
import com.hemi.factor.web.dao.CustomMapper;
import com.hemi.factor.web.dao.SysUserMapper;
import com.hemi.factor.web.model.SysPermission;
import com.hemi.factor.web.model.SysUser;
import com.hemi.factor.web.model.SysUserExample;
import com.hemi.factor.web.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by Vanguard on 2016/12/20.
 */
@Service
public class UserServiceImpl extends GenericServiceImpl<SysUser,String>implements UserService{
    @Resource
    private SysUserMapper userMapper;

    @Resource
    private CustomMapper customMapper;

    @Override
    public GenericDao<SysUser, String> getDao() {
        return userMapper;
    }

    @Override
    public SysUser authentication(SysUser sysUser) {
        SysUser user = userMapper.authentication(sysUser);
        return user;
    }

    @Override
    public SysUser selectByUsername(String username) {
        SysUserExample example = new SysUserExample();
        example.createCriteria().andUsernameEqualTo(username);
        final List<SysUser> list = userMapper.selectByExample(example);
        return list.get(0);
    }

    @Override
    public SysUser selectByUsercode(String usercode) {
        SysUserExample example = new SysUserExample();
        example.createCriteria().andUsercodeEqualTo(usercode);
        final List<SysUser> list = userMapper.selectByExample(example);
        return list.get(0);
    }

    /**
     * 根据用户Id查询url
     * @param userId
     * @return
     */
    @Override
    public List<SysPermission> findPermissionListByUserId(String userId){
        return customMapper.findPermissionListByUId(userId);
    }

    /**
     * 根据用户Id查询菜单
     * @param userId
     * @return
     */
    @Override
    public List<SysPermission> findMenuListByUserId(String userId){
        List<SysPermission> sysPermissions = customMapper.findMenuListByUId(userId);
        return sysPermissions;
    }



}
