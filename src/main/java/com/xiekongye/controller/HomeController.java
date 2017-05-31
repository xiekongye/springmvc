package com.xiekongye.controller;

import com.xiekongye.models.Customer;
import com.xiekongye.models.User;
import com.xiekongye.service.ITestService;
import com.xiekongye.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.inject.Inject;
import javax.inject.Named;
import javax.jws.WebParam;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import java.util.List;

/**
 * Created by You on 2017/5/26.
 *
 * 页面上的Model必须设置对象，不然会报异常页面无法展示
 */
@Controller
@RequestMapping({"/home"})
public class HomeController {

    @Inject
    @Named("testService")
    private ITestService testService;

    @Inject
    @Named("userService")
    private IUserService userService;

    /**
     * 用户首页
     * */
    @RequestMapping({"/index"})
    public ModelAndView index(HttpSession session){
        String userName = (String)session.getAttribute("userName");
        User user = userService.getUserInfo(userName);
        if (user == null){
            ModelAndView mv = new ModelAndView("error");
            return mv;
        }else{
            ModelAndView mv = new ModelAndView("user");
            return mv;
        }
    }

    /**
     * 跳转注册页面
     * */
    @RequestMapping({"/register"})
    public ModelAndView register(){
        ModelAndView mv = new ModelAndView("register");
        return mv;
    }

    /**
     * 跳转到登录页
     * */
    @RequestMapping({"/login"})
    public ModelAndView login(){
        ModelAndView mv = new ModelAndView("login");
        return mv;
    }
}
