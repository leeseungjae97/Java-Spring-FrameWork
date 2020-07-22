package AOP;

import org.springframework.aop.ThrowsAdvice;
import org.springframework.stereotype.Component;

@Component("throwingLog")
public class AfterThrowingAdvice implements ThrowsAdvice {
	public void afterThrowing(NullPointerException e) throws Throwable {
		System.out.println("널 참조 발생");
	}
}
