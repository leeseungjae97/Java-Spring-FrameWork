package com.mycompany.service;

import javax.servlet.http.HttpSession;

import com.mycompany.exception.BoardException;

public interface BoardInsert {
	void execute(HttpSession session, String content)throws BoardException;
}
