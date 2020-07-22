package javaConfiguration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		
		ctx.register(javaConfiguration.config.AppConfig.class);
		ctx.register(javaConfiguration.config.SystemConfig.class);	
		ctx.refresh();
		//register을 이용하여 등록했다면
		//refresh를 해주어야 한다.
		
		String n = ctx.getBean(String.class);
		String m = (String)ctx.getBean("name");
		ArrayList<String> x = ctx.getBean("getList", ArrayList.class);		
		for(String i : x) {
			System.out.println(i);
		}
		
		Map<String, Integer> map = ctx.getBean("map", HashMap.class);
		Set<String> keySet = map.keySet();
		
		Iterator<String> keyIter = keySet.iterator();
		while(keyIter.hasNext()) {
			String key = keyIter.next();
			System.out.printf("%s %d\n", key, map.get(key));
			
		}
		
		ctx.close();
	}
}
