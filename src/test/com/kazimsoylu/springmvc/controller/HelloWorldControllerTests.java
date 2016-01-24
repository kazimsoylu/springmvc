package com.kazimsoylu.springmvc.controller;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by kazim on 24.1.2016.
 */
public class HelloWorldControllerTests {

    @Test
    public void test(){
        HelloWorldController controller = new HelloWorldController();
        ModelAndView modelAndView = controller.welcome("kazim");
        Assert.assertEquals(modelAndView.getViewName(),"hello");
        Assert.assertEquals(modelAndView.getModel().get("name"),"kazim");
    }
}
