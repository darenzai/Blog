package com.darenzai.mybatis.demo.Mapper;

import com.darenzai.mybatis.demo.BEANS.person;

public interface PersonMapper {

    int add(person person);

    int update(person person);

    int deleteByIds(String name);



}
