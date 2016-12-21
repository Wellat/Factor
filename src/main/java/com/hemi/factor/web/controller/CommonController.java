package com.hemi.factor.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * 公共视图控制器
 * Created by Vanguard on 2016/12/21.
 */
@Controller
public class CommonController {
    @RequestMapping("index")
    public String index(HttpServletRequest request){
        return "index";
    }
}
