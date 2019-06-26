package com.darenzai.blog02;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @RequestMapping("/sss")
    public String ss(){

        return "Hello";


    }



}
