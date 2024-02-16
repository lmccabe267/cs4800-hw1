package Polymorphism;

public class Driver {

	public static void main(String[] args) {
		Ship[] ships = new Ship[3];
		ships[0] = new Ship("Normal Ship", 2020);
		ships[1] = new CruiseShip("Cruise Ship", 2018, 5000);
		ships[2] = new CargoShip("Cargo Ship", 2010, 100000);
		for(int i = 0; i < ships.length; ++i) {
			ships[i].print();
		}
	}

}
