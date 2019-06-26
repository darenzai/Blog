package com.darenzai.blog03;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.darenzai.blog03.Mapper.UserMapper")
public class Blog03Application {

    public static void main(String[] args) {
        SpringApplication.run(Blog03Application.class, args);
    }

}
