package beantest2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("main/AppContext.xml");
		Person p = ctx.getBean("person1", Person.class);
		Person p2 = ctx.getBean("person2" , Person.class);
		System.out.println(p);
		System.out.println(p2);
		
	}
}

