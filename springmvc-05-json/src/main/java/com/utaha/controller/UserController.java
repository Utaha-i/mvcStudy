package com.utaha.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.utaha.pojo.User;
import com.utaha.utils.JsonUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class UserController {

    @RequestMapping("/json1")
    public String json1() throws JsonProcessingException {
        //创建一个jackson的对象映射器，用来解析数据
        ObjectMapper mapper = new ObjectMapper();
        //创建一个对象
        User user = new User(001, "utaha", 16);
        //将我们的对象解析成为json格式
        String str = mapper.writeValueAsString(user);
        //由于@ResponseBody注解，这里会将str转成json格式返回；十分方便
        return str;
    }

    @RequestMapping("/json2")
    public String json2() throws JsonProcessingException {

        User user1 = new User(001, "utaha1", 16);
        User user2 = new User(001, "utaha2", 16);
        User user3 = new User(001, "utaha3", 16);

        List<User> users = new ArrayList<>();

        users.add(user1);
        users.add(user2);
        users.add(user3);

//        return new ObjectMapper().writeValueAsString(users);
        return JsonUtils.getJson(users);
    }

    @RequestMapping("/json3")
    public String json3() throws JsonProcessingException {

        /*
            关闭时间戳
         */
//        ObjectMapper mapper = new ObjectMapper();
//        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        Date date = new Date();
        /*
            1628664654860
            时间解析后默认的格式为时间戳，Timestamp
         */

//        return new ObjectMapper().writeValueAsString(new SimpleDateFormat("yyyy-mm-dd hh:mm:ss").format(date));
        return JsonUtils.getJson(date,"yyyy-mm-dd hh:mm:ss");
    }

}
