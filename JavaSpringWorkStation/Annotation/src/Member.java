
public class Member {
	
	@InitValue(value2="홍길동")
	private String name;
	
	@InitValue(value=100)
	private int age;
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@DefaultMethod
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	
	}
	@DefaultMethod
	public void print2() {
		// TODO Auto-generated method stub
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	
	}
}
