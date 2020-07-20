
public class Member {
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
	public Member() {
		;
	}
	public void print() {
		System.out.printf("%s %d", name, age);
	}
	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
}
