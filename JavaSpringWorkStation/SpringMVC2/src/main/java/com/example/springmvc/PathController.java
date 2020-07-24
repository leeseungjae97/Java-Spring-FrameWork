package com.example.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PathController {
	@RequestMapping("/member/{id}/{number}") //> http://localhost:8080/mvcTest/member/find/dltmdwo2323
	public String path(@PathVariable("id") String id, 
			@PathVariable("number") String number, Model model) {
		
		model.addAttribute("id", id);
		model.addAttribute("number", number);
		return "pathVariable";
	}
}
