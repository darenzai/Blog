package com.darenzai.jpatest01.dao;

import com.darenzai.jpatest01.Beans.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface UserReposity  extends JpaRepository<User,Integer> {



}
