package com.zhaokai.vuehr.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Created by ZhaoKai on 2019/10/8 23:14
 */
@RestController
public class Hello {
    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
}
