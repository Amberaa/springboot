package com.example.springbootmybatis;

import com.example.springbootmybatis.dao.UserMapper;
import com.example.springbootmybatis.entity.User;
import com.example.springbootmybatis.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import java.util.List;

/*@RunWith(SpringRunner.class)
@SpringBootTest*/
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SpringbootmybatisApplication.class,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SpringbootmybatisApplicationTests {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserService userService;


    @Test
    public void addUser(){
        try {
            int i = userService.insertUser("李四", 22, "17833335555");
            if(i > 0){
                System.out.println("添加成功");
            }else{
                System.out.println("添加失败");
            }
            System.out.println(userService.selectUserList());
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void selectUser(){
        List<User> users = userMapper.selectUserList();
        System.out.println(users);
    }

    @Test
    public void selectUsers(){
        List<User> users = userService.selectUserList();
        System.out.println(users);
    }

    @Test
    public void update(){
        try {
            User user = userService.selectById(1);
            System.out.println("更新前："+user);
            user.setAge(25);
            int i = userService.updateUser(user);
            if(i > 0){
                System.out.println("更新成功");
            }else{
                System.out.println("更新失败");
            }

            System.out.println("更新后："+user);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void delete(){
        try {
            int i = userService.deleteUser(2);
            List<User> users = userService.selectUserList();
            System.out.println(users);
            if (i > 0) {
                System.out.println("删除成功");
            } else {
                System.out.println("删除失败");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void selectUserById(){
        User user = userService.selectById(1);
        System.out.println(user);
    }

}
