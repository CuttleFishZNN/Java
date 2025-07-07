package com.cuttlefish._04mybatis.mapper;

import com.cuttlefish._04mybatis.pojo.entity.Weibo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WeiboMapper {
    @Insert("insert into Weibo(content,created,user_id) values(#{content}," +
            "#{created},#{userId})")
    void insert(Weibo weibo);

    @Delete("delete from Weibo where id = #{id}")
    void deleteById(int id);
}
