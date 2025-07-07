package com.cuttlefish.eg2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestLife {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com/cuttlefish/eg2");
        System.out.println("IOC容器已创建");
        Life life = context.getBean(Life.class);
        System.out.println("4.实际应用");
    }
}
