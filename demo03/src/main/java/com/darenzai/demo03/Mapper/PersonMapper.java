package com.darenzai.demo03.Mapper;

import com.darenzai.demo03.bean.Person;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;



@Mapper
public interface PersonMapper {


    @Insert("insert into perison(name,age,address) values(#{name},#{age},#{address})")
    int add(Person person);



    @Select("select * from user where name=#{name}")
    Person selectById(String name);


}



