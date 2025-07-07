package com.cuttlefish._04mybatis.mapper;

import com.cuttlefish._04mybatis.pojo.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

   // @Insert("INSERT INTO User(username,password,nickname,created) values(#{username},#{password},#{nickname},#{createdTime})")
    void insert(User user);
}
