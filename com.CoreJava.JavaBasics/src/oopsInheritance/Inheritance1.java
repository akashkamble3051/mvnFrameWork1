package oopsInheritance;

class Bike { // parent class / superclass
	int maxFuelCapacity = 12;
	int maxSeatingCapacity = 2;

	void start() {
		System.out.println("Bike starts");
	}

	void stop() {
		System.out.println("Bike stopped");
	}
}

// we can achieve inheritance between two classes using 'extends' keyword

public class Inheritance1 extends Bike { // child class / subclass

	public static void main(String[] args) {
		Inheritance1 obj = new Inheritance1();
		System.out.println("Max fule capacity " + obj.maxFuelCapacity);
		System.out.println("Max seating capacity " + obj.maxSeatingCapacity);
		obj.start();
		obj.stop();
	}
}
