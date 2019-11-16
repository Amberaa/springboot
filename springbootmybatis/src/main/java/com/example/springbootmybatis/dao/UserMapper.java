package com.example.springbootmybatis.dao;

import com.example.springbootmybatis.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

     List<User> selectUserList();
     int insertUser(@Param("name") String name , @Param("age") int age, @Param("phone") String phone);
     int updateUser(User user);
     int deleteUser(int id);
     User selectById(@Param("id") int id);
}
