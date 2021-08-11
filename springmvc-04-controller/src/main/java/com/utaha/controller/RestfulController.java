package com.utaha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RestfulController {

    //原来:       http://localhost:8888/04/add?a=1&b=2
    //restful:      http://localhost:8888/04/add/a/b

    //    @RequestMapping(value = "/add/{a}/{b}",method = RequestMethod.GET)
    @GetMapping("/add/{a}/{b}")
    public String test01(@PathVariable int a, @PathVariable int b, Model model) {
        int res = a + b;
        model.addAttribute("msg", "结果为：" + res);
        return "test";
    }

    @PostMapping("/add2")
    public String test02(int a, int b, Model model) {
        int res = a + b;
        model.addAttribute("msg", "结果为：" + res);
        return "test";
    }
}
