package com.darenzai.blog04.UserMapper;

import com.darenzai.blog04.POJO.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
@Mapper
public interface UserMapper {

    List<User> findAll();

}
