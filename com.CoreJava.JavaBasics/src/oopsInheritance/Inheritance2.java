package oopsInheritance;

// Single-level inheritance, one parent class and one child class 
class Fruit { // parent class
	static String colour;
	double weight;
	private int price;  // private members will never get inherited in the child class

	public void fruitTaste() {
		System.out.println("taste method of Fruit class");
	}

	public static void vitamins() {
		System.out.println("vitamins method of Fruit class");
	}
}

class Apple extends Fruit { // child class
//	static String colour;
//	double weight;
//
//	public void fruitTaste() {
//		System.out.println("taste method of Fruit class");
//	}
//	
//	public static void vitamins() {
//		System.out.println("vitamins method of Fruit class");
//	}
}

public class Inheritance2 {
	public static void main(String[] args) {
		Apple obj = new Apple();
		System.out.println(obj.weight);
//		System.out.println(obj.price);
		obj.fruitTaste();

		System.out.println(Apple.colour);
		Apple.vitamins();
	}
}
