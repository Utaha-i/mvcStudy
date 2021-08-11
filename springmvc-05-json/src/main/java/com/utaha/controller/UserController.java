package com.utaha.controller;

import com.utaha.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @RequestMapping("/json1")
    @ResponseBody
    public String json1()  {
        //创建一个jackson的对象映射器，用来解析数据
//        ObjectMapper mapper = new ObjectMapper();
        //创建一个对象
        User user = new User(001, "utaha", 16);
        //将我们的对象解析成为json格式
//        String str = mapper.writeValueAsString(user);
        //由于@ResponseBody注解，这里会将str转成json格式返回；十分方便
        return user.toString();
    }

}
