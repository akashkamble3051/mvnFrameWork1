package oopsAbstraction;

abstract class Vehicle { // Vehicle class is abstract class
	abstract public void start();

	abstract public void stop();
}

abstract class BMW extends Vehicle { // BMW class is abstract class
//	abstract public void start();

//	abstract public void stop();

	abstract public void gearTransition();
}

class X1 extends BMW { // X1 class is concrete class, or its a complete class
//	abstract public void start();

//	abstract public void stop();

//	abstract public void gearTransition();
	public void start() {
		System.out.println("Button start");
	}

	public void stop() {
		System.out.println("Button stop");
	}

	public void gearTransition() {
		System.out.println("Automatic gear transition");
	}
}

public class Abstraction2 {

	public static void main(String[] args) {
		Vehicle obj = new X1(); // object upcasting
		obj.start();
		obj.stop();
//		obj.gearTransition(); // since gearTransition is not a member of Vehicle class obj cannot access it

		BMW obj1 = new X1(); // object upcasting
		obj1.start();
		obj1.stop();
		obj1.gearTransition();
	}

}
