package com.mycompany.dao;

import com.mycompany.exception.BoardException;

public class BoardInsertException extends BoardException {
	private static final long serialVersionUID = 1L;
	private final static String MSG="게시물 입력에 실패하였습니다.";
	
	public BoardInsertException() {
		this(MSG);
	}
	
	public BoardInsertException(String message) {
		super(message);
	}

}
