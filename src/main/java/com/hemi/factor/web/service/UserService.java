package com.hemi.factor.web.service;

import com.hemi.factor.core.generic.GenericService;
import com.hemi.factor.web.model.SysPermission;
import com.hemi.factor.web.model.SysUser;

import java.util.List;

/**
 * Created by Vanguard on 2016/12/20.
 */
public interface UserService extends GenericService<SysUser,String>{
    /**
     * 用户验证
     * @param sysUser
     * @return
     */
    SysUser authentication(SysUser sysUser);


    /**
     * 根据用户Id查询url
     * @param userId
     * @return
     */
    List<SysPermission> findPermissionListByUserId(String userId);

    /**
     * 根据用户Id查询菜单
     * @param userId
     * @return
     */
    List<SysPermission> findMenuListByUserId(String userId);


    SysUser selectByUsername(String username);

    /**
     * 由Usercode查User
     * @param usercode
     * @return
     */
    SysUser selectByUsercode(String usercode);
}
