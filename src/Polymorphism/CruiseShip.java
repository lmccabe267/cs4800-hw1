package Polymorphism;

public class CruiseShip extends Ship{
	private int maxPassengers;
	
	public CruiseShip(String name, int year, int maxPassengers) {
		super(name, year);
		this.maxPassengers = maxPassengers;
	}
	
	public int getMaxPassengers() {
		return maxPassengers;
	}
	
	public void setMaxPassengers(int maxPassengers) {
		this.maxPassengers = maxPassengers;
	}
	
	@Override
	public void print() {
		System.out.println("Ship name: " + name + "\nMax Passengers: " + maxPassengers + "\n");
	}
}
