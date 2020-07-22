package beantest2;

public class Person{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]\n";
	}

	public void destroy() throws Exception {
		System.out.println(this + "按眉 家戈");
	}

	public void init() throws Exception { 
		System.out.println(this + "按眉 积己");
		
	}
	
	
}
