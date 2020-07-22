package AOP;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Component;

@Component("beforeLog")
public class BeforeLog implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		//method : 호출 메서드 , args : 호출 시 주어진 인수 , target : 메서드 호출 주체
		//전처리 작업 작성
		System.out.println("메서드 호출 전에 수행할 코드");
		System.out.println("메서드 호출 : " + method.getName());
		System.out.println("호출 인수 개수 : " + args.length);
		System.out.println("Core 객체 타입 : " + target.getClass().getName());
	}

}
