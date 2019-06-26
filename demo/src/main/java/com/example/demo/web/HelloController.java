package com.example.demo.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@ResponseBody
@Controller
public class HelloController {


    @RequestMapping("/hello")
    public String hello(){

        String ss="ssss";
        return "ssss";
    }






}
