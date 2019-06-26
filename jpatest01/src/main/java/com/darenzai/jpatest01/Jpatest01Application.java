package com.darenzai.jpatest01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.darenzai.jpatest01.dao")
@SpringBootApplication
@EntityScan("com.darenzai.jpatest01.Beans.User")
public class Jpatest01Application {

    public static void main(String[] args) {
        SpringApplication.run(Jpatest01Application.class, args);
    }

}
