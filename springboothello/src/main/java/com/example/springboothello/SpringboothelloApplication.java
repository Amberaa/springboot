package com.example.springboothello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication 注解：是SprnigBoot项目的核心注解，目的是开启自动配置
 * 等同于@Configuration ，@EnableAutoConfiguration 和 @ComponentScan 三个配置
 * @ComponentScan：让spring Boot扫描到Configuration类并把它加入到程序上下文
 * @Configuration ：等同于spring的XML配置文件；使用Java代码可以检查类型安全
 * @EnableAutoConfiguration ：自动配置
 */
@SpringBootApplication
public class SpringboothelloApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringboothelloApplication.class, args);
    }

}
