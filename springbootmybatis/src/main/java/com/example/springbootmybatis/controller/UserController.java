package com.example.springbootmybatis.controller;

import com.example.springbootmybatis.entity.User;
import com.example.springbootmybatis.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/add")
    public String addUser(@Param("name") String name, @Param("age") int age, @Param("phone") String phone){

        userService.insertUser(name,age,phone);
        return "添加成功";
    }

    @RequestMapping("/user")
    @ResponseBody
    public List<User> selectUsers(){
        List<User> users = new ArrayList<>();
        users = userService.selectUserList();
        return users;
    }

    public String updateUser(User user){


        return "";
    }
}
