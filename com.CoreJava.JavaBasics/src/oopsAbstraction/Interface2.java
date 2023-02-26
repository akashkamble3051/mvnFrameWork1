package oopsAbstraction;

interface Vehicle1 {
	void numberOfWheel(); // public abstract void numberOfWheel();
}

interface Car extends Vehicle1 {
//	void numberOfWheel();
	void maxSeatingCapacity(); // public abstract void maxSeatingCapacity();
}

class BMW1 implements Car {
//	void numberOfWheel();
//	void maxSeatingCapatiy();
	@Override
	public void numberOfWheel() {
		System.out.println("BMW car has 4 wheels");
	}

	@Override
	public void maxSeatingCapacity() {
		System.out.println("BMW has max seating capacity as 5");
	}
}

public class Interface2 {

	public static void main(String[] args) {
		Vehicle1 vObj = new BMW1(); // object upcasting
		vObj.numberOfWheel();
//		vObj.maxSeatingCapacity(); 

		Car cObj = new BMW1(); // object upcating
		cObj.numberOfWheel();
		cObj.maxSeatingCapacity();
	}

}
