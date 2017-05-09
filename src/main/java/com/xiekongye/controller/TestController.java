package com.xiekongye.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by kyxie on 2017/5/9.
 */
@Controller
@RequestMapping("/mvc")
public class TestController {

    @RequestMapping("/hello")
    public String helloWorld(){
        return "Hello World !";
    }
}
