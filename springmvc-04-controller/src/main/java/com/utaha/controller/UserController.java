package com.utaha.controller;

import com.utaha.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/t1")
    public String test01(@RequestParam("username") String name, Model model){
        model.addAttribute("msg",name);

        return "test";
    }
    @GetMapping("/t2")
    public String test02(User user, Model model){
        model.addAttribute("msg",user);

        return "test";
    }
    @PostMapping("/t3")
    public String test03(@RequestParam("name") String name, Model model){
        model.addAttribute("msg",name);
        System.out.println(name);
        return "test";
    }

}
