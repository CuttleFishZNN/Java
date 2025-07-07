package com.cuttlefish.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestUser {
    public static void main(String[] args) {
        /**
            1.Spring Framework创建对象，放入IOC容器中
            2.从IOC容器中获取对象
            3.调run()方法进行测试
         *
         */
        ApplicationContext context = new AnnotationConfigApplicationContext
                ("com.cuttlefish.example");
        User user = context.getBean(User.class);
        user.run();

    }
}
