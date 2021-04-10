package com.dongxs.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @describe:
 * @author: dongdongdong
 * @time: 2021/4/10
 **/
@RestController
public class TestController {
    @RequestMapping("/test/demo")
    public String demo(){
        return "hello";
    }
}
