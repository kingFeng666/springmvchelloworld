package com.shangguan.springmvc.controller;

import com.sun.deploy.net.HttpResponse;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName: HelloAnnotationController
 * @Description:
 * @Author: 李峰
 * @Date: 2020 年 09月 20 14:55
 * @Version 1.0
 */
@Controller
public class HelloAnnotationController {
    /*//注解开发
    @RequestMapping("/helloAnnotation")
    public ModelAndView hello(HttpServletRequest request, HttpServletResponse response){
        List<String> list= Arrays.asList("Hello","Hello world" ,"spring","springmvc" );
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("list");
        modelAndView.addObject("list",list);
        return modelAndView;*/


        //springmvc 的高级开发
    @RequestMapping("/helloMethod")
    public String method(Model model){
            List<String> list1 = Arrays.asList("Hello","World","Spring","SpringMVC");
            //封装数据
            model.addAttribute("list",list1);
            //视图的名称
            return  "list";
        }
     @RequestMapping("/list")
      public String list(){
            //视图的名称
            //默认的页面到达方式使用的是跳转
            return  "list";
        }
    //重定向
    @RequestMapping("/helloMethod2")
    public String method2(){
        //视图的名称
        //默认的页面到达方式使用的是跳转
        //重定向到页请求
        return  "redirect:list";
    }
}


