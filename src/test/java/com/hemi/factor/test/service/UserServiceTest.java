package com.hemi.factor.test.service;

import com.hemi.factor.core.entity.MenuTree;
import com.hemi.factor.core.feature.test.TestSupport;
import com.hemi.factor.core.util.TreeUtils;
import com.hemi.factor.web.model.*;
import com.hemi.factor.web.service.PermissionService;
import com.hemi.factor.web.service.RoleService;
import com.hemi.factor.web.service.UserService;
import org.junit.Test;
import sun.reflect.generics.tree.Tree;

import javax.annotation.Resource;
import java.security.Permission;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserServiceTest extends TestSupport {
    @Resource
    private UserService userService;


//    @Test
    public void test_userService(){
        List<SysPermission> resultList = userService.findMenuListByUserId("ua01");
        List<MenuTree> menuTreeList = new ArrayList<MenuTree>();
        for(SysPermission menu:resultList){
            MenuTree menuTree = new MenuTree();
            menuTree.setId(menu.getId());
            menuTree.setParentid(menu.getParentid());
            menuTree.setName(menu.getName());
            menuTreeList.add(menuTree);
        }
        System.out.println();
        for(MenuTree tree1:menuTreeList){
            System.out.println("======="+tree1.getName());

        }
    }

}
