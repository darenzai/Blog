package com.darenzai.demo03.ServiceImp;

import com.darenzai.demo03.Mapper.PersonMapper;
import com.darenzai.demo03.Service.PersonService;
import com.darenzai.demo03.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PersonServiceImp implements PersonService {

   @Autowired
    PersonMapper personMapper;

    @Override
    public int add(Person person) {
        return personMapper.add(person);
    }



    @Override
    public Person selectById(String name) {
        return personMapper.selectById(name);
    }
}
