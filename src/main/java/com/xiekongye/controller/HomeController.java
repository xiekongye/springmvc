package com.xiekongye.controller;

import com.xiekongye.models.Customer;
import com.xiekongye.service.ITestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;
import java.util.Map;

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

    @RequestMapping({"/index"})
    public ModelAndView Index(){
        List<Customer> customers = testService.getCustomers();

        ModelAndView mv = new ModelAndView();
        mv.setViewName("home");
        mv.addObject("customers",customers);
        mv.addObject("serviceInfo",testService.getInfo());
        return mv;
    }
}
