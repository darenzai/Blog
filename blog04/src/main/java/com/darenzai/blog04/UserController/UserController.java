package com.darenzai.blog04.UserController;


import com.darenzai.blog04.POJO.User;
import com.darenzai.blog04.UserService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;


    @RequestMapping("/helloxml")
    public List<User> helloxml(){

        return userService.findAll();

    }

}
