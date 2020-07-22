package AOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("AOP/AppContext.xml");
		Test test = ctx.getBean("proxy", Test.class);
		test.print();
		
		
	}
	
}
