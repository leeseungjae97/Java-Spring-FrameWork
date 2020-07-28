package kr.co.lectopia;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AndroidBoardCastController {
	
	@RequestMapping(value="/list")
	public String getMessage() {
		return "list";
	}
}
