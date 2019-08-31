package com.ncoo.demo.controller;

import com.ncoo.demo.model.User;
import com.ncoo.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author weilong
 * @date 2019/8/29 17:31
 */


@Controller
public class IndexController {

    @Autowired
    private UserService userService;

    @RequestMapping(path = "/index", method = RequestMethod.GET)
    public String index() {
        return "index/index";
    }

    @RequestMapping(path = "/login/do2", method = RequestMethod.GET)
    public String loginDo2(Model model, HttpServletRequest request) {
        String tel = request.getParameter("tel");
        User user = userService.selectUserByTel(tel);
        String name = user.getName();
        model.addAttribute("name", name);
        return "ncoo/index";
    }

    @RequestMapping(path = "register/do2", method = RequestMethod.GET)
    public String registerDo2() {
        return "index/index";
    }
}
