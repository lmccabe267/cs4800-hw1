package Polymorphism;

public class Ship {
	protected String name;
	protected int year;
	
	public Ship(String name, int year) {
		this.name = name;
		this.year = year;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void print() {
		System.out.println("Ship name: " + name + "\nYear Built: " + year + "\n");
	};
}
