package com.darenzai.blog03.Mapper;

import com.darenzai.blog03.Beans.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;



@Repository
@Mapper
public interface UserMapper {


    @Select("select * from user")
    List<User>  findAll();

}
