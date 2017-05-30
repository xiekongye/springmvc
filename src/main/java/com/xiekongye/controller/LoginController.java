package com.xiekongye.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * Created by You on 2017/5/30.
 *
 * 请求转发：forward:/home/index
 *
 * 重定向：redirect:/home/index
 */
@Controller
public class LoginController {

    @RequestMapping("/login")
    public String login(HttpSession session,String userName,String password){
        session.setAttribute("userName",userName);
        return "forward:/home/index";
    }

    @RequestMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:/home/register";
    }
}
