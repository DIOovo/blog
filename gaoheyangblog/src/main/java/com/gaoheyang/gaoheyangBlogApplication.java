package com.gaoheyang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author 三更  B站： https://space.bilibili.com/663528522
 */
@SpringBootApplication
@MapperScan("com.gaoheyang.mapper")
public class gaoheyangBlogApplication {
    public static void main(String[] args) {
        SpringApplication.run(gaoheyangBlogApplication.class,args);
    }
}