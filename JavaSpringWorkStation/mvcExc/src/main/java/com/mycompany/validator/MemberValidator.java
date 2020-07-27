package com.mycompany.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.mycompany.command.MemberCommand;

public class MemberValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return clazz.isAssignableFrom(MemberCommand.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
		MemberCommand cmd = (MemberCommand)target;
		if(cmd.getEmail() == null || cmd.getEmail().trim().equals("")) {
			errors.rejectValue("email", "email.required", "이메일이 입력되지 않았습니다.");
		}
		if(cmd.getPass() == null || cmd.getPass().trim().equals("")) {
			errors.rejectValue("pass", "pass.required", "비밀번호가 입력되지 않았습니다.");
		}
		if(cmd.getPassCheck() == null || !cmd.getPass().equals(cmd.getPassCheck())) {
			errors.rejectValue("passCheck", "passCheck.required", "비밀번호확인이 틀립니다.");
		}
		if(cmd.getNick() == null || cmd.getNick().trim().equals("")) {
			errors.rejectValue("nick", "nick.required", "닉네임이 입력되지 않았습니다.");
		}
		
	}
}
