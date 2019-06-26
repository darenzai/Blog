package com.darenzai.blog04.UserService;


import com.darenzai.blog04.POJO.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {


    List<User>  findAll();



}
