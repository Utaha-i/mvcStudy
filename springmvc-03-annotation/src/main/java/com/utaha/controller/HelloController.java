package com.utaha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//http://localhost:8888/03/hello/h1
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/h1")
    public String hello(Model model){
        model.addAttribute("msg","Hello,springmvcAnnotation");
        //return的内容会被视图解析器处理。
        return "hello";
    }

}
