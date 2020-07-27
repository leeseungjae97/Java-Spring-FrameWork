package com.mycompany.exception;

public class MemberNotFoundException extends MemberException {
	private static final long serialVersionUID = 1L;
	private final static String MSG="존재하지 않는 메일주소이거나 비밀번호가 일치하지 않습니다.";
	public MemberNotFoundException() {
		this(MSG);
	}
	public MemberNotFoundException(String message) {
		super(message);
	}
}
