package oopsAbstraction;

abstract class Fruit { // Fruit class is a abstract class, which inherits the Object class
//	this class can have abstract and non-abstract methods
//	we cannot make static method as abstract method

	abstract public void fruitTaste(); // abstract method

	public static void fruitBenefits() { // non-abstract method
		System.out.println("Fruits are good for our health....");
	}
}

class Apple extends Fruit { // Apple class is non-abstract class, which inherits the Fruit class
//	we cannot write abstract method in non-abstract class	

//	abstract public void fruitTaste();
//	public static void fruitBenefits() { // non-abstract method
//		System.out.println("Fruits are good for out health....");
//	}

//	Apple class must implement the inherited abstract methods of the Fruit class

	public void fruitTaste() {
		System.out.println("Apple's taste is Sweet and Sour");
	}
}

public class Abstraction1 {

	public static void main(String[] args) {
		Fruit obj = new Apple(); // object upcasting
		obj.fruitTaste();
		Fruit.fruitBenefits();
	}

}
