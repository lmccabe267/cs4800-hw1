package Polymorphism;

public class CargoShip extends Ship {
	private int tonnage;
	
	public CargoShip(String name, int year, int tonnage) {
		super(name, year);
		this.tonnage = tonnage;
	}
	
	public int getTonnage() {
		return tonnage;
	}
	
	public void setTonnage(int tonnage) {
		this.tonnage = tonnage;
	}
	
	@Override
	public void print() {
		System.out.println("Ship name: " + name + "\nCargo Capacity: " + tonnage + "\n");
	}
}
