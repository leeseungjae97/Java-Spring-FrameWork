package com.mycompany.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mycompany.vo.BoardVO;

@Controller
public class BoardController {

	@RequestMapping(value="/BoardInsert", method=RequestMethod.GET)
	public String board() {
		return "boardInsert";
	}
	@RequestMapping(value="/BoardInsert", method=RequestMethod.POST)
	public String boardInsert(@ModelAttribute("board") BoardVO board, Model model) {
		return "boardResult";
	}
}
