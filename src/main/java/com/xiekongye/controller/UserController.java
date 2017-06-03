package com.xiekongye.controller;

import com.xiekongye.models.User;
import com.xiekongye.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.inject.Inject;

/**
 * Created by You on 2017/6/3.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Inject
    private IUserService userService;

    @RequestMapping(value = "/{userName}",method = RequestMethod.GET)
    public String getUser(@PathVariable("userName") String userName, Model model){
        model.addAttribute("userInfo",userService.getUserInfo(userName));
        return "user";
    }
}
