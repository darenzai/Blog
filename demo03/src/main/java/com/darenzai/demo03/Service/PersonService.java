package com.darenzai.demo03.Service;

import com.darenzai.demo03.bean.Person;
import org.springframework.stereotype.Service;

@Service
public interface PersonService {

    int add(Person person);


    Person selectById(String name);

}
