package inheritance;

public class SalariedEmployee extends Employee{
	private int weeklySalary;
	
	public SalariedEmployee() {
		super();
		setWeeklySalary(0);
	}
	
	public SalariedEmployee(String firstName, String lastName, String socialSecurity, int weeklySalary) {
		super(firstName, lastName, socialSecurity);
		this.setWeeklySalary(weeklySalary);
	}

	public int getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(int weeklySalary) {
		this.weeklySalary = weeklySalary;
	}
	
	
}
