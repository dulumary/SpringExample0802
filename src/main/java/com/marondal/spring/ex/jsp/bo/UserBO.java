package com.marondal.spring.ex.jsp.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marondal.spring.ex.jsp.dao.UserDAO;
import com.marondal.spring.ex.jsp.model.User;

@Service
public class UserBO {
	
	@Autowired
	private UserDAO userDAO;
	
	// new user 데이터 저장
	// 이름, 생년월일, 자기소개, 이메일
	public int addUser(String name, String birthDay, String introduce, String email) {
		return userDAO.insertUser(name, birthDay, introduce, email);
	}
	
	public int addUserByObject(User user) {
		return userDAO.inserUserByObject(user);
	}
	
	// 최근 등록된 사용자 가져오기 
	public User getLastUser() {
		
		return userDAO.selectLastUser();
	}

}
