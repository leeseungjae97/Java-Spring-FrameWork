package com.example.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CommandController {
	@RequestMapping(value="/command", method=RequestMethod.GET)
	public String command() {
		return "form";
	}
	
	@RequestMapping(value="/command", method=RequestMethod.POST)
	public String command(@ModelAttribute("student") Student student) {
		return "redirect:formResult";
	}
}
