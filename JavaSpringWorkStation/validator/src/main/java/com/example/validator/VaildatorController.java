package com.example.validator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.validator.commnad.MemberCommand;
import com.example.validator.validator.MemberValidator;

@Controller
public class VaildatorController {

	@RequestMapping(value="/validator", method=RequestMethod.GET)
	public String getVaildater(Model model) {
		model.addAttribute("info", new MemberCommand());
		return "form";
	}
	
	@RequestMapping(value="/validator", method=RequestMethod.POST)
	public String postVaildater(@ModelAttribute("info") MemberCommand cmd, Errors errors) {
		new MemberValidator().validate(cmd, errors);
		if(errors.hasErrors()) {
			return "form";
		}
		else {
			return "result";
		}
	}
}
