package Employee;

import org.springframework.stereotype.Component;

@Component("PartTime")
public class PartTime implements Employee{
	private String name;
	private int workTime;
	private int payPerTime;
	public PartTime(String name, int workTime, int payPerTime) {
		super();
		this.name = name;
		this.workTime = workTime;
		this.payPerTime = payPerTime;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWorkTime() {
		return workTime;
	}
	public void setWorkTime(int workTime) {
		this.workTime = workTime;
	}
	public int getPayPerTime() {
		return payPerTime;
	}
	public void setPayPerTime(int payPerTime) {
		this.payPerTime = payPerTime;
	}
	@Override
	public int pay() {
		return 0;
	}
	
	
}	
