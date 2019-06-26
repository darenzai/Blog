package com.darenzai.blog03.ServiceImp;

import com.darenzai.blog03.Beans.User;
import com.darenzai.blog03.Mapper.UserMapper;
import com.darenzai.blog03.Service.UService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UServiceImp implements UService {


    @Autowired
    UserMapper userMapper;




    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }
}
