package com.cuttlefish._04mybatis.mapper;

import com.cuttlefish._04mybatis.pojo.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;  // 新增

@Mapper
public interface UserMapper {
    @Results({
            @Result(property = "createdTime", column = "created")
    })
    @Insert("INSERT INTO User(username,password,nickname,created) values(#{username},#{password}," +
            "#{nickname},#{createdTime})")
    void insert(User user);
}
