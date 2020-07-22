package spring;

public class Regular implements Employee {
	public static String TYPE="정규직";
	private String name;
	private int salary;

	public Regular(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	
	@Override
	public int pay() {
		return (salary / 12);
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getType() {
		return TYPE;
	}

}
