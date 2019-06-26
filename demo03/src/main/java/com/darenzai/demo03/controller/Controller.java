package com.darenzai.demo03.controller;

import com.darenzai.demo03.Mapper.PersonMapper;
import com.darenzai.demo03.Service.PersonService;
import com.darenzai.demo03.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    @Autowired
    PersonService personService;

    @RequestMapping( value = "/selectByName", method = RequestMethod.GET)
    public Person queryStudentBySno(String name) {
        return personService.selectById(name);
    }


    @RequestMapping("/hello")
    public String Hello(){

        return "Hello Spring";
    }


}
