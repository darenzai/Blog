package com.darenzai.jpatest01.controller;


import com.darenzai.jpatest01.Beans.User;
import com.darenzai.jpatest01.dao.UserReposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserReposity userReposity;

    @RequestMapping("/getnameUser")
    public List<User> getnameUser(String name){


        return userReposity.findAll();
    }



}
