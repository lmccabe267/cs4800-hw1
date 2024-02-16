package inheritance;

public class BaseEmployee extends Employee {
	private int baseSalary;
	
	public BaseEmployee() {
		setBaseSalary(0);
	}
	
	public BaseEmployee(String firstName, String lastName, String socialSecurity, int baseSalary) {
		super(firstName, lastName, socialSecurity);
		this.setBaseSalary(baseSalary);
	}

	public int getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(int baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	
	
}
