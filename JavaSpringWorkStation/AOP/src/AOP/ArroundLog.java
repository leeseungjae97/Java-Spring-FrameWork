package AOP;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.stereotype.Component;

@Component("arroundLog")
public class ArroundLog implements MethodInterceptor {
//Cross-cutting concert
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		Object obj = null;
		System.out.println("주 업무 이전에 수행할 작업");
		obj = invocation.proceed();
		System.out.println("주 업무 이후에 수행할 작업");
		return obj;
	}
}
