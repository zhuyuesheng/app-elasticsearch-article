package com.zhuys.module.route;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author zhuys
 * @company tydic
 * @create 2022-04-02
 */
@Controller
public class IndexRoute {

    /**
     * 瘦素首页
     * @param request
     * @return
     */
    @RequestMapping("index")
    public String index(HttpServletRequest request) {
        return "index";
    }

}
