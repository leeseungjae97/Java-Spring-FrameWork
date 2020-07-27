package com.example.validator.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.example.validator.commnad.MemberCommand;

public class MemberValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		//return MemberCommand.class.isAssignableFrom(clazz);
		//Class를 이용한 비교.
		
		return clazz.isAssignableFrom(MemberCommand.class);
		
	}

	@Override
	public void validate(Object target, Errors errors) {
		// Validator가 검증 할 수 있는 타입인가를 검사하는데 사용
		// target = memberCommand
		// validate로 넘어 오는 targetd에 대한 type체크를 supprots에서 하게된다.
		
		//supports에서 type비교가 끝난 후 validate로 넘어온다
		MemberCommand cmd = (MemberCommand)target;
		if(cmd.getName() == null || cmd.getName().trim().equals("")) {
			errors.rejectValue("name", "name.required", "회원이름이 입력되지 않았습니다.");
			//arg1 = fielName
			//errorCode = Message 
			//defaultMessage = errorCode가 없다면 지정될 Message
		}
		//ValidationUtils.rejectIfEmptyOrWhitespace(errors, field, errorCode);
		if(cmd.getAge() == 0) {
			errors.rejectValue("age", "age.required", "연령이 입력되지 않았습니다.");
		}
	}
}
