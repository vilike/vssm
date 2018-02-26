package com.test.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/mybatisController")
public class MybatisController {
	
	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	
	@RequestMapping(params="selectUser")
	public void selectUser(HttpServletRequest request) {
		// 数据库会话实例
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			sqlSession = sqlSessionFactory.openSession();
			//User user = sqlSession.selectOne("test.entity.User","123");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(null!=sqlSession){
				sqlSession.close();
			}
		}
	}
	
	@RequestMapping(params="selectUser1")
	public String selectUser1(HttpServletRequest request) {
		return "index";
	}
}
