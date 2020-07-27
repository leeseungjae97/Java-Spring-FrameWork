package com.example.springmvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String index(HttpServletRequest request, Model model) {
		return "member/registerForm";
	}
	
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public ModelAndView welcome() {
		ModelAndView mav = new ModelAndView();
		String email = null;
		String pass = null;
		String passCheck = null;
		mav.addObject("email", email);
		mav.addObject("pass", pass);
		mav.addObject("passCheck", passCheck);
		mav.setViewName("member/registerForm");
		return mav;
	}
//	@RequestMapping(value="/register", method=RequestMethod.POST)
//	public String resultView(HttpServletRequest request, Model model) {
//		//request.setCharacterEncoding("default charset=utf8");
//		MemberVO member = new MemberVO();
//		member.setEmail(request.getParameter("email"));
//		member.setPass(request.getParameter("pass"));
//		member.setPassCheck(request.getParameter("passCheck"));
//		member.setNick(request.getParameter("nick"));
//		
//		model.addAttribute("member", member);
//		return "member/result";
//	}

	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String resultView(@RequestParam("email") String email,
			@RequestParam("pass") String pass,
			@RequestParam("passCheck") String passCheck,
			@RequestParam("nick") String nick, Model model) {
		
		
		MemberVO member = new MemberVO(email, pass, passCheck, nick);
		model.addAttribute("member", member);
		return "member/result";
	}
	
}
