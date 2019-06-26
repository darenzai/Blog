package com.darenzai.blog04.UserServiceImp;

import com.darenzai.blog04.POJO.User;
import com.darenzai.blog04.UserMapper.UserMapper;
import com.darenzai.blog04.UserService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceIml implements UserService {

    @Autowired
    UserMapper userMapper;




    public List<User> findAll(){


        return userMapper.findAll();

    }


}
