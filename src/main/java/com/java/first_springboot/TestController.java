package com.java.first_springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@Controller
public class TestController {

    @RequestMapping(path = "/testcontroller/helloword")
    public String helloword(HttpServletRequest request) {
        request.setAttribute("hello", "hello aaaadfdfdf sssss fdfdf");
        return "helloworld";
    }

    @ResponseBody
    @RequestMapping(path = "/testcontroller/hello")
    public String hello() {
        return "helloworld aaaa bbbbb dfdffdfd";
    }
}
