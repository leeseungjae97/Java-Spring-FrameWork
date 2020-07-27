package com.mycompany.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mycompany.command.MemberCommand;
import com.mycompany.exception.MemberException;
import com.mycompany.service.MemberInsert;
import com.mycompany.validator.MemberValidator;

@Controller
@RequestMapping("/member")
public class MemberController {
	
	@Autowired
	@Qualifier("memberInsert")
	MemberInsert service;
	
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public String register(Model model) {
		model.addAttribute("info", new MemberCommand());
		return "member/registerForm";
	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String register(@ModelAttribute("info") MemberCommand member, Model model, Errors errors) {
		new MemberValidator().validate(member, errors);
		if(errors.hasErrors()) {
			return "member/registerForm";
		}
		else {
			service.execute(member);
			return "member/result";
		}
		
		
	}
	@RequestMapping(value="/update", method=RequestMethod.GET)
	public String update(HttpSession session, Model mode) {
		//MemberVO member = session.getAttribute("member");
		
		
		return "member/update";
	}
//	@ExceptionHandler(MemberException.class)
//	public String handleException() {
//		return "member/error";
//	}
}
