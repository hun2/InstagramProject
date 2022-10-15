package com.example.demo.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserDAO;
import com.example.demo.model.User;

@Service
public class UserBO {
	
	@Autowired
	private UserDAO userDao;
	
	//회원가입
	public void addUser(User user) {
		
		userDao.insertUser(user);
	}
	
	
	//회원가입_id 중복확인
	public Boolean get_id_user(String uid) {
		
		return userDao.select_id_user(uid);
	}
	
	
	//로그인 시 id 및 password 값 select 하기
	public Boolean get_loign_user(String uid, String pwd) {
		
		return userDao.select_loign_user(uid, pwd);
	}
}

