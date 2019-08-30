package com.ncoo.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author weilong
 * @date 2019/8/29 17:31
 */

@Controller
public class IndexController {

    @RequestMapping(path = "/index", method = RequestMethod.GET)
    public String index() {
        return "index/index";
    }

    @RequestMapping(path = "/login", method = RequestMethod.GET)
    public String login() {
        return "login/login";
    }

    @RequestMapping(path = "/")
    public String loginDo() {
        return "ncoo/index";
    }
}
