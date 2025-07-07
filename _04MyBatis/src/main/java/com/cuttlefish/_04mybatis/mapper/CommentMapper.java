package com.cuttlefish._04mybatis.mapper;

import com.cuttlefish._04mybatis.pojo.entity.Comment;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CommentMapper {

    @Insert("INSERT INTO Comment(content,created,user_id,weibo_id) " +
            "VALUES(#{content},#{created},#{userId},#{weiboId})")
    void insert(Comment comment);

}
