package com.mycompany.mybatis;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AndroidBroadCastController {
	@RequestMapping(value="/list")
	public String getMessage() {
		return "list";
	}
}
