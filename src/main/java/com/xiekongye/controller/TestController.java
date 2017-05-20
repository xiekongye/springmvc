package com.xiekongye.controller;

import com.xiekongye.service.ITestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.inject.Inject;
import java.util.Map;

/**
 * Created by kyxie on 2017/5/9.
 */
@Controller
public class TestController {
    //private static final Logger logger = LoggerFactory.getLogger(TestController.class);

    private ITestService testService;

    @Inject
    public TestController(ITestService testService){
        this.testService = testService;
    }

    @RequestMapping({"/","/helloWorld"})
    public String helloWorld(Map<String,Object> model){
        model.put("serviceInfo",testService.getInfo());
        model.put("customers",testService.getCustomers());
        return "helloWorld";
    }
}
