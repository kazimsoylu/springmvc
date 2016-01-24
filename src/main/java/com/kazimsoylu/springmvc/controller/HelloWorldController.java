package com.kazimsoylu.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by kazim on 23.1.2016.
 */
@Controller
public class HelloWorldController {

    @RequestMapping("/hello")
    public ModelAndView welcome( @RequestParam(value = "name",required = false) String name ){
        ModelAndView modelAndView = new ModelAndView("hello");
        modelAndView.addObject("name",name);

        return modelAndView;
    }
}
