package spring;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component("user")
public class User {
	@Autowired
	private ArrayList<String> users;
	
	@Autowired
	@Qualifier("map")
	private Map<String, Integer> scores;

	
	
	public void print() {
		for (String name : users) {
			System.out.println(name);
		}
	}
	
	public void scorePrint() {
		Set<String> keySet = scores.keySet();
		Iterator<String> keyI = keySet.iterator();
		while(keyI.hasNext()) {
			String key = keyI.next();
			System.out.println(key + " : " + scores.get(key));
		}
	}
}
