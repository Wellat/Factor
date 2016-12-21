package com.hemi.factor.core.util;

import com.hemi.factor.core.entity.MenuTree;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Created by Vanguard on 2016/12/21.
 */
public class TreeUtils {
    /**
     * 父节点
     * @param menuTrees
     * @return
     */
    public final static List<MenuTree> getfatherNode(List<MenuTree> menuTrees){
        List<MenuTree> menuTreeList = new ArrayList<MenuTree>();
        for(MenuTree menuTree:menuTrees){
            if(menuTree.getParentid()==null){
                //获取父节点下的子节点
                menuTree.setChildren(getChildrenNode(menuTree.getId(),menuTrees));
                menuTree.setState("open");
                menuTreeList.add(menuTree);
            }
        }
        return menuTreeList;
    }

    /**
     * 子节点
     * @param pid
     * @param menuTrees
     * @return
     */
    public final static List<MenuTree> getChildrenNode(Long pid,List<MenuTree> menuTrees){
        List<MenuTree> menuTreeList = new ArrayList<MenuTree>();
        for(MenuTree menuTree:menuTrees){
            if(menuTree.getParentid()==null) continue;
            if(menuTree.getParentid().equals(pid)){
                //递归获取子节点下的子节点
                menuTree.setChildren(getChildrenNode(menuTree.getId(),menuTrees));
                menuTreeList.add(menuTree);
            }
        }
        return menuTreeList;
    }
}
