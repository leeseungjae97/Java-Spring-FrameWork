package com.mycompany.exception;

public class BoardException extends Exception {
	private static final long serialVersionUID = 1L;
	private static final String MSG="게시물 등록에 실패하였습니다.";
	public BoardException () {
		this(MSG);
	}
	public BoardException (String message) {
		super(message);
	}
}
