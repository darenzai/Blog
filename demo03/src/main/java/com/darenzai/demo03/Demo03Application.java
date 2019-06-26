package com.darenzai.demo03;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.darenzai.demo03.Mapper")
@SpringBootApplication
public class Demo03Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo03Application.class, args);
    }

}
