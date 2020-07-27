package com.mycompany.mvcExc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping(value="/") //홈페이지
	public String main() {
		return "index";
	}
}
