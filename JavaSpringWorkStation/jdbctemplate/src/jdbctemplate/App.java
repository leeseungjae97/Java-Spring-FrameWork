package jdbctemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import jdbctemplate.service.SelectByEmail;
import jdbctemplate.service.SelectByEmailPass;

public class App {
	public static void main(String[] args) throws Exception{
		ApplicationContext ctx = new GenericXmlApplicationContext("AppContext.xml");
//		MemberRegister service = ctx.getBean(MemberRegister.class);
//		service.execute("sky_battle@naver.com", "1234", "1234", "yUsiL");
		SelectByEmail service = ctx.getBean(SelectByEmail.class);
		service.execute("sky_battle@naver.com");
		SelectByEmailPass service2 = ctx.getBean(SelectByEmailPass.class);
		service2.execute("sky_battle@naver.com", "1234");
	}
}
