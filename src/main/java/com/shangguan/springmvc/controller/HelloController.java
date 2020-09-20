package com.shangguan.springmvc.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName: HelloController
 * @Description:
 * @Author: 李峰
 * @Date: 2020 年 09月 20 14:23
 * @Version 1.0
 */
public class HelloController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest,
                                      HttpServletResponse httpServletResponse) throws Exception {
        List<String> list= Arrays.asList("Hello","spring","springMVC","world");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("list");
        modelAndView.addObject("list",list);
        return modelAndView;
    }
}
