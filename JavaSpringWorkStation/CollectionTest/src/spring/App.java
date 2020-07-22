package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("AppContext.xml");
		Person p = ctx.getBean(Person.class);
		p.print();
	}
}
