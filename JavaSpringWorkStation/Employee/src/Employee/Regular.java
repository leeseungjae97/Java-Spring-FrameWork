package Employee;

import org.springframework.stereotype.Component;

@Component("Regular")
public class Regular implements Employee{
	private int salary;
	private String name;
	
	
	
	public Regular(int salary, String name) {
		super();
		this.salary = salary;
		this.name = name;
	}


	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}

	
	
	
	@Override
	public String toString() {
		return "Regular [salary=" + salary + ", name=" + name + "]";
	}



	@Override
	public int pay() {
		
		return 0;
	}

}
