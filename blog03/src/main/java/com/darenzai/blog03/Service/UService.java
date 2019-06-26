package com.darenzai.blog03.Service;

import com.darenzai.blog03.Beans.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UService {
    public List<User> findAll();

}
