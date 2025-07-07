package com.cuttlefish._04mybatis.mapper;

import com.cuttlefish._04mybatis.pojo.entity.Weibo;
import org.apache.ibatis.annotations.*;

@Mapper
public interface WeiboMapper {
    @Insert("insert into Weibo(content,created,user_id) values(#{content}," +
            "#{created},#{userId})")
    void insert(Weibo weibo);

    @Delete("delete from Weibo where id = #{id}")
    int deleteById(int id);

    @Update("update Weibo set content=#{content},created=#{created},user_id=#{userId} where id = #{id}")
    int updateWeiboById(Weibo weibo);

    @Select("SELECT id,content,created,user_id userId from Weibo where id = #{id} ")
    Weibo selectWeiboById(int id);
}
