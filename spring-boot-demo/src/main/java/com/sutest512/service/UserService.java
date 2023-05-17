package com.sutest512.service;

import com.sutest512.entity.User;
import com.sutest512.entity.UserExample;
import com.sutest512.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Service
public class UserService implements UserServicei {

    @Autowired
    private UserMapper userMapper;

    public List<User> findAll() {
        return userMapper.selectByExample(new UserExample());
    }



//


//    public User findOne(Integer id){
//        return userMapper.selectByPrimaryKey(id);
//    }
}
