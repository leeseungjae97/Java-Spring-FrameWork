package com.mycompany.dao;

import com.mycompany.exception.MemberException;

public class MemberInsertFailedException extends MemberException {
	private static final long serialVersionUID = 1L;
	
	private final static String MSG="멤버등록에 실패하였습니다.";
	
	public MemberInsertFailedException() {
		super(MSG);
	}
	public MemberInsertFailedException(String message) {
		super(message);
	}
	
}
