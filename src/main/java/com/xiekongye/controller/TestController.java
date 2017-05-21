package com.xiekongye.controller;

import com.xiekongye.service.ITestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.inject.Inject;
import java.util.Map;

/**
 * Created by kyxie on 2017/5/9.
 */
@Controller
@RequestMapping("/test")
public class TestController {
    //private static final Logger logger = LoggerFactory.getLogger(TestController.class);

    private ITestService testService;

    @Inject
    public TestController(ITestService testService){
        this.testService = testService;
    }

    //处理Get请求
    @RequestMapping(value = {"/helloWorld"},method = RequestMethod.GET)
    public String helloWorld(@RequestParam("param") String param, Map<String,Object> model){
        model.put("serviceInfo",testService.getInfo());
        model.put("customers",testService.getCustomers());
        return "home";
    }

    @RequestMapping(value = "testFreemarker",method = RequestMethod.GET)
    public ModelAndView testFreemarker(){

        ModelAndView mv = new ModelAndView();
        mv.setViewName("customer");
        mv.addObject("customers",testService.getCustomers());
        return mv;
    }

}
