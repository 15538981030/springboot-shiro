package com.baizhi.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/7/16.
 */
@Controller
@RequestMapping("/user")
public class UserController {


    @RequestMapping("/loginUser")
    public String login(String name, String password) {
        Subject subject = SecurityUtils.getSubject();
        boolean flag = false;
        try {
            subject.login(new UsernamePasswordToken(name, password));
            flag = true;
        } catch (AuthenticationException e) {

            e.printStackTrace();
        }
        if (flag) {
            return "index";
        } else {
            return "/main/login";
        }
    }

    @RequestMapping("/userLogout")
    public String login() {
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        return "/main/login";
    }
}
