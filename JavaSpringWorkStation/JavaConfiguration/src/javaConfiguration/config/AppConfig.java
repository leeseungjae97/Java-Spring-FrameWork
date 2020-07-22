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
		return "ȫ�浿";
	}
	
	@Bean
	@Scope("prototype")
	public ArrayList<String> getList() {
		ArrayList<String> list = new ArrayList<>();
		list.add("�̼���");
		list.add("������");
		list.add("������");
		
		return list;
	}
}
