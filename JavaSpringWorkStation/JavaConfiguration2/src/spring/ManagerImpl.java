package spring;

import java.util.ArrayList;

public class ManagerImpl implements Manager{
	ArrayList<Employee> employees = new ArrayList<>();
	@Override
	public void pay() {
		System.out.println("----------------------");
		for(Employee employee : employees) {
			System.out.printf("%s\t%s\t%d\n",
					employee.getName(),
					employee.getType(),
					employee.pay());
		}
		
	}

	@Override
	public void addEmployee(Employee employee) {
		employees.add(employee);
		
	}

}
