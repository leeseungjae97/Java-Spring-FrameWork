package Employee;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component("ManagerImp")
public class ManagerImple implements Manager{
	ArrayList<Employee> employees = new ArrayList<>();
	
	@Override
	public void pay() {
		for( Employee emp : employees) {
			
		}
	}

	@Override
	public void addEmployee(Employee emp) {
		
	}

}
