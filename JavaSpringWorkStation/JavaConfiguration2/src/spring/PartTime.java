package spring;

public class PartTime implements Employee {
	private static String TYPE="계약직";
	private String name;
	private int TimePerMonery;

	public PartTime(String name, int TimePerMoney) {
		this.name = name;
		this.TimePerMonery = TimePerMoney;
	}

	@Override
	public int pay() {
		return TimePerMonery;
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
