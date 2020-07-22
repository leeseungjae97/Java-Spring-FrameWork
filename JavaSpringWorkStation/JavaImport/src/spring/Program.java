package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Program {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/config/SpringConfig.xml");
		//ApplicationContext ctx = new AnnotationConfigApplicationContext(spring.config.JavaConfig.class);
		User user = ctx.getBean("user", User.class);
		user.print();
		user.scorePrint();
	}	
}
