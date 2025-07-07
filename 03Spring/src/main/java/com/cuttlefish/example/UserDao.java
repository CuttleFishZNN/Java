package com.cuttlefish.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    @Value("jdbc:mysql://localhost:3306/cuttlefish")
    private String url;
    @Value("root")
    private String username;
    @Value("lqy20011019")
    private String password;

    @Override
    public String toString() {
        return "UserDao{" +
                "url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
