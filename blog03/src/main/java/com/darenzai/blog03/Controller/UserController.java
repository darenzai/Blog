package com.darenzai.blog03.Controller;


import com.darenzai.blog03.Beans.User;
import com.darenzai.blog03.Mapper.UserMapper;
import com.darenzai.blog03.Service.UService;
import com.darenzai.blog03.ServiceImp.UServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*

    以SringBoot Mybatis 注解方式运行项目

 */

@RestController
public class UserController {



    @Autowired
    UService  uService;
    @RequestMapping("/hello")
    public List<User> ss(){



        return uService.findAll();
    }


}
