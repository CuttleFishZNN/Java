package com.cuttlefish.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestUserDao {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(
                "com/cuttlefish/example");
        UserDao userDao = context.getBean(UserDao.class);
        System.out.println(userDao.toString());
    }
}
