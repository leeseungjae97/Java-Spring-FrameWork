package AOP;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.stereotype.Component;

@Component("afterReturningLog")
public class AfterReturningLog implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("Core Concern 수행 후 수행할 코드 작성");
		System.out.println("수행 결과 : " + returnValue);
		System.out.println("호출 메서드 명 : " + method.getName());
		System.out.println("호출 인수의 수 : " + args.length);
		System.out.println("Core Concern 의 타입" + target.getClass().getName());
	}

}
