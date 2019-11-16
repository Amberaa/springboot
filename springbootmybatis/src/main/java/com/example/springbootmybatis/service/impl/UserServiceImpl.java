package com.example.springbootmybatis.service.impl;

import com.example.springbootmybatis.dao.UserMapper;
import com.example.springbootmybatis.entity.User;
import com.example.springbootmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectUserList() {
        return userMapper.selectUserList();
    }


    @Override
    @Transactional
    public int insertUser(String name, int age, String phone) {
        return userMapper.insertUser(name, age, phone);
    }

    @Override
    @Transactional
    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }

    @Override
    @Transactional
    public int deleteUser(int id) {
        return userMapper.deleteUser(id);
    }

    @Override
    public User selectById(int id) {
        User user = userMapper.selectById(id);
        return user;
    }


}
