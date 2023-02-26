package javaConstructor;

class Car {
//	since we have not defined constructor here, so this class contains default constructor
//	Default constructor will be written in the .class file by the compiler
	
//	Car(){
//		super();
//	}
	
	int maxSpeed = 220;
	int maxSeatingCapacity = 5;

	public void carStart() {
		System.out.println("Car started");
	}

	void carStop() {
		System.out.println("Car stopped");
	}
}

public class Constructor1 {

	public static void main(String[] args) {
//		dataType reference_variable = new keyword call_Of_constructor
		Car obj = new Car();
	}

}
