package com.cuttlefish.example;

import org.springframework.stereotype.Component;

/**
 * Component注解： 标识该类为Spring的组件，Spring Framework会为该类创建对象
 */
@Component
public class User {
   public void run(){
       System.out.println("周六保证不放假，周日放假不保证");
    }
}
