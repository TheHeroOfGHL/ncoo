package com.ncoo.demo.controller;

import com.ncoo.demo.model.User;
import com.ncoo.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author weilong
 * @date 2019/8/31 13:50
 */
@Controller
public class NcooController {

    @Autowired
    private UserService userService;

    @RequestMapping(path = "/login", method = RequestMethod.GET)
    public String login() {
        return "login/login";
    }

    @ResponseBody
    @RequestMapping(path = "/login/do", method = RequestMethod.POST)
    public Map<String, String> loginDo(Model model, HttpServletRequest request) {
        String tel = request.getParameter("telnum");
        String password = request.getParameter("password");
        Map<String, String> res = new HashMap<>();
        res.put("tel", tel);
        if (userService.isTrueUser(tel, password)) {
            res.put("result", "success");
        } else {
            res.put("result", "error");
        }
        return res;
    }

    @RequestMapping(path = "register", method = RequestMethod.GET)
    public String register() {
        return "login/register";
    }

    @ResponseBody
    @RequestMapping(path = "/register/do", method = RequestMethod.POST)
    public Map<String, String> registerDo(HttpServletRequest request) {
        String tel = request.getParameter("telnum");
        String name = request.getParameter("name");
        String password = request.getParameter("pass");
        String sex = request.getParameter("sex");
        Map<String, String> res = new HashMap<>();
        if (userService.isTelExist(tel)) {
            res.put("result", "error");
            return res;
        }
        else
            res.put("result", "success");
        User user = new User();
        user.setName(name);
        user.setPassword(password);
        user.setSex(sex);
        user.setTel(tel);
        return res;
    }
}
