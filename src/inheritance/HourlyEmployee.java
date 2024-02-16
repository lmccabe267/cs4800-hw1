package inheritance;

public class HourlyEmployee extends Employee{
	private int wage, hoursWorked;
	
	public HourlyEmployee() {
		setWage(setHoursWorked(0));
	}
	
	public HourlyEmployee(String firstName, String lastName, String socialSecurity, int wage, int hoursWorked) {
		super(firstName, lastName, socialSecurity);
		this.setWage(wage);
		this.setHoursWorked(hoursWorked);
	}

	public int getWage() {
		return wage;
	}

	public void setWage(int wage) {
		this.wage = wage;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public int setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
		return hoursWorked;
	}
	
}
