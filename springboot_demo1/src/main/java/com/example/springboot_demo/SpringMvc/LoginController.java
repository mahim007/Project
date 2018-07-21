package com.example.springboot_demo.SpringMvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class LoginController {
    @RequestMapping(value = "/login")
    public String login(){
        return "Hello World";
    }
}
