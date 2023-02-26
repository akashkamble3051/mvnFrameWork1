package oopsInheritance;
// in multi-level inheritance child class will inherit parent class, and and another class will inherit that child class

class Vehicle {
	int maxSpeed = 250;

	void vehicleStart() {
		System.out.println("Start method of Vehicle class");
	}
}

class Car extends Vehicle {
//	int maxSpeed = 250;
//	void vehicleStart() {
//		System.out.println("Start method of Vehicle class");
//	}
	void carStop() {
		System.out.println("Stop method of Car class");
	}
}

class BMW extends Car { // BMW class will inherit the Car class property, and Car class has Vehicle
						// class property
//	therefore BMW class will inherit the properties of Car & Vehicle class 
//	int maxSpeed = 250;
//
//	void vehicleStart() {
//		System.out.println("Start method of Vehicle class");
//	}
//
//	void carStop() {
//		System.out.println("Stop method of Car class");
//	}
}

public class Inheritance3 {
	public static void main(String[] args) {
		BMW obj = new BMW();
		System.out.println(obj.maxSpeed);
		obj.vehicleStart();
		obj.carStop();

		Car obj1 = new Car();
		System.out.println(obj1.maxSpeed);
		obj1.vehicleStart();
		obj1.carStop();
		
		Vehicle obj2 = new Vehicle();
		System.out.println(obj1.maxSpeed);
		obj2.vehicleStart();
//		obj2.carStop(); // parent class will not inherit the child class memebers
	}
}
