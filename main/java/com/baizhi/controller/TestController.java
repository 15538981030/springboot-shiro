package com.baizhi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/7/16.
 */
@Controller
@RequestMapping("/test")
public class TestController {
    @RequestMapping("/test")
    public String test() {

        return "index";
    }
}
