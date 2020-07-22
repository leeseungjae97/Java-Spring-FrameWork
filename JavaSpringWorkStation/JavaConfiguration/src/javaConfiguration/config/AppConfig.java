package javaConfiguration.config;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
	
	@Bean
	@Scope("prototype")
	public String name() {
		return "홍길동";
	}
	
	@Bean
	@Scope("prototype")
	public ArrayList<String> getList() {
		ArrayList<String> list = new ArrayList<>();
		list.add("이순신");
		list.add("강감찬");
		list.add("엄복동");
		
		return list;
	}
}
