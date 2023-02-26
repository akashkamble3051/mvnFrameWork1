package javaEncapsulation;

// how to create read only class
// to create the read only class provide only getter methods
class Bike {
	private int maxSpeed = 200;
	private int seatingCapacity = 2;

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public int getSeatingCapacity() {
		return seatingCapacity;
	}

}

public class EncapsulationReadOnly {

	public static void main(String[] args) {
		Bike obj = new Bike();
		System.out.println("max speed : " + obj.getMaxSpeed());
		System.out.println("max seating capacity : " + obj.getSeatingCapacity());
	}

}
