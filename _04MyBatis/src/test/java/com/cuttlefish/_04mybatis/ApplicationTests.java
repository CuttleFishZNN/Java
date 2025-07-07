package com.cuttlefish._04mybatis;

import com.cuttlefish._04mybatis.mapper.CommentMapper;
import com.cuttlefish._04mybatis.mapper.UserMapper;
import com.cuttlefish._04mybatis.mapper.WeiboMapper;
import com.cuttlefish._04mybatis.pojo.entity.Comment;
import com.cuttlefish._04mybatis.pojo.entity.User;
import com.cuttlefish._04mybatis.pojo.entity.Weibo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class ApplicationTests {
	/**
	 *    接口的自动装载
	 */
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private WeiboMapper weiboMapper;
	@Autowired
	private CommentMapper commentMapper;

	@Test
	void contextLoads() {
	}
	@Test
	void insertUserTest(){
		User user = new User(1L,"zhang","010418","ZNN",new Date());
		userMapper.insert(user);
	}

	@Test
	void insertWeiboTest(){
		Weibo weibo = new Weibo("hello world",new Date(),2);
		weiboMapper.insert(weibo);

	}

	@Test
	void deleteByIdTest(){
		weiboMapper.deleteById(205);

	}
	@Test
	void insertCommentTest(){
		Comment comment = new Comment("hello world",new Date(),200L,2L);
		commentMapper.insert(comment);

	}

}
