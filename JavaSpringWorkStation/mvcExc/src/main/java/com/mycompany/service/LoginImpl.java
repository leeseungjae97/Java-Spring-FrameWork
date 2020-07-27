package com.mycompany.service;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.mycompany.dao.MemberDAO;
import com.mycompany.exception.MemberException;
import com.mycompany.exception.MemberNotFoundException;
import com.mycompany.vo.MemberVO;

@Service("login")
public class LoginImpl implements Login {

	@Autowired
	@Qualifier("memberDAO")
	private MemberDAO dao;
	
	@Override
	public void execute(HttpSession session, String email, String pass) throws MemberException {
		MemberVO member = dao.login(email, pass);
		if(member == null ) {
			throw new MemberNotFoundException();
		}
		session.setAttribute("loginInfo", member);
	}

}
