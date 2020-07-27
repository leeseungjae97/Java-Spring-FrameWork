package com.mycompany.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mycompany.exception.MemberException;
import com.mycompany.service.Login;

@Controller
public class LoginController {

	@Autowired
	private Login service;
	@RequestMapping(value="/mypage")
	public String mypage() {
		return "mypage";
	}
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login() {
		return "logForm";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST) 
	public String login(@RequestParam("email") String email,
			@RequestParam("pass") String pass,
			HttpServletRequest request,
			HttpSession session) {
		try {
			service.execute(session, email, pass);
			return "mypage";
		}
		catch(MemberException e) {
			e.printStackTrace();
			return "loginError";
		}
	}
	
}
