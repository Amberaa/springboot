package com.example.springbootmybatis.service;

import com.example.springbootmybatis.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
    List<User> selectUserList();
    int insertUser(@Param("name") String name, @Param("age") int age, @Param("phone") String phone);
    int updateUser(User user);
    int deleteUser(int id);
    User selectById(@Param("id") int id);
}
