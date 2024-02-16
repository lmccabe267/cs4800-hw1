package inheritance;

public class CommissionEmployee extends Employee {
	private int commissionRate, grossSales;
	
	public CommissionEmployee() {
		setCommissionRate(setGrossSales(0));
	}
	
	public CommissionEmployee(String firstName, String lastName, String socialSecurity, int commissionRate, int grossSales) {
		super(firstName, lastName, socialSecurity);
		this.setCommissionRate(commissionRate);
		this.setGrossSales(grossSales);
	}

	public int getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(int commissionRate) {
		this.commissionRate = commissionRate;
	}

	public int getGrossSales() {
		return grossSales;
	}

	public int setGrossSales(int grossSales) {
		this.grossSales = grossSales;
		return grossSales;
	}
}
