package com.darenzai.demo04.Controller;

import com.darenzai.demo04.beans.Person;
import com.darenzai.demo04.jpaService.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JpaController {

    @Autowired
    PersonRepository personRepository;

    @RequestMapping("/save")
    public Person save(String name,String address,Integer age){
        Person person=personRepository.save(new Person(null,name,age,address));

        return person;
    }


    @RequestMapping("/selectaddress")
    public List<Person> q1(String address){

        List<Person> people =personRepository.findByAddress(address);

        return  people;

    }







}
