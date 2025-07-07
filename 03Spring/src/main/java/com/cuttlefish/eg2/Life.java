package com.cuttlefish.eg2;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Life {
    private String mean;

    private Life(){
        System.out.println("1.无参构造");
    }
    @Value("happy")
    public void setMean(String mean){
        this.mean = mean;
        System.out.println("2.set函数");
    }

    @PostConstruct
    public void init(){
        System.out.println("3.初始化");
    }


}
