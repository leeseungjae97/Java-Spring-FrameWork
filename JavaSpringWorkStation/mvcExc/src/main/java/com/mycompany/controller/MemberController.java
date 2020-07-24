package com.mycompany.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mycompany.command.MemberCommand;
import com.mycompany.exception.MemberException;
import com.mycompany.service.MemberInsert;
import com.mycompany.vo.MemberVO;

@Controller
@RequestMapping("/member")
public class MemberController {
	
	@Autowired
	@Qualifier("memberInsert")
	MemberInsert service;
	
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public String register() {
		return "member/registerForm";
	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String register(@ModelAttribute("info") MemberCommand member, Model model) {
		if(member.getEmail().trim().equals("")) {
			model.addAttribute("errorMessage", "메일 주소가 입력되지 않았습니다");
			return "member/registerForm";
		}
		
		if(member.getPass().trim().equals("")) {
			model.addAttribute("errorMessage", "비밀번호가 입력되지 않았습니다.");
			return "member/registerForm";
		}
		
		if(!member.getPass().equals(member.getPassCheck())) {
			model.addAttribute("errorMessage", "비밀번호와 비밀번호 확인이 일치하지 않습니다..");
			return "member/registerForm";
		}
		
		if(member.getNick().trim().equals("")) {
			model.addAttribute("errorMessage", "닉네임이 입력되지 않았습니다.");
			return "member/registerForm";
		}
		
		service.execute(member);
		return "member/result";
	}
	@RequestMapping(value="/update", method=RequestMethod.GET)
	public String update(HttpSession session, Model mode) {
		//MemberVO member = session.getAttribute("member");
		
		
		return "member/update";
	}
	@ExceptionHandler(MemberException.class)
	public String handleException() {
		return "member/error";
	}
}
