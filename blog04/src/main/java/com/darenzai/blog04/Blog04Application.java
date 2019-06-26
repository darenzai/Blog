package com.darenzai.blog04;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
       XML 形式Springboot Mybatis


 */


@SpringBootApplication
@MapperScan("com.darenzai.blog04.UserMapper.UserMapper")
public class Blog04Application {

    public static void main(String[] args) {
        SpringApplication.run(Blog04Application.class, args);
    }

}
