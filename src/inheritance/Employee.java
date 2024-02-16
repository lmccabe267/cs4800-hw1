package inheritance;

public class Employee {
	private String firstName, lastName, socialSecurity;
	
	public Employee() {
		firstName = lastName = socialSecurity = "";
	}
	
	public Employee(String firstName, String lastName, String socialSecurity) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setSocialSecurity(socialSecurity);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSocialSecurity() {
		return socialSecurity;
	}

	public void setSocialSecurity(String socialSecurity) {
		this.socialSecurity = socialSecurity;
	}
	
	
}
