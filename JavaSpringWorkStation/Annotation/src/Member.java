
//@InitValue 위치가 field가 아니므로 쓸 수 없다.
public class Member {
	
	@InitValue
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
