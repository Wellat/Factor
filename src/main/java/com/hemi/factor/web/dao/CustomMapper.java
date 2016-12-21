package com.hemi.factor.web.dao;

import com.hemi.factor.web.model.SysPermission;

import java.util.List;

/**
 * Created by Vanguard on 2016/12/20.
 */
public interface CustomMapper {
    /**
     * 根据用户Id查询url
     * @param userId
     * @return
     */
    List<SysPermission> findPermissionListByUId(String userId);

    /**
     * 根据用户Id查询菜单
     * @param userId
     * @return
     */
    List<SysPermission> findMenuListByUId(String userId);

}
