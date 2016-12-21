package com.hemi.factor.web.dao;

import com.hemi.factor.core.generic.GenericDao;
import com.hemi.factor.web.model.SysRole;
import com.hemi.factor.web.model.SysRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRoleMapper extends GenericDao<SysRole,String> {
    int countByExample(SysRoleExample example);

    int deleteByExample(SysRoleExample example);

    int deleteByPrimaryKey(String id);

    int insert(SysRole record);

    int insertSelective(SysRole record);

    List<SysRole> selectByExample(SysRoleExample example);

    SysRole selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SysRole record, @Param("example") SysRoleExample example);

    int updateByExample(@Param("record") SysRole record, @Param("example") SysRoleExample example);

    int updateByPrimaryKeySelective(SysRole record);

    int updateByPrimaryKey(SysRole record);

    /**
     * 通过用户id 查询用户拥有的角色
     * @param userId
     * @return
     */
    List<SysRole> selectRolesByUserId(String userId);
}