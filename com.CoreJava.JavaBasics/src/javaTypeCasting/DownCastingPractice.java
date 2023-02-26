package javaTypeCasting;

class Fruit1 {
	int weight;

	void taste() {
		System.out.println("Print fruit taste");
	}
}

class Mango1 extends Fruit1 {
	double price = 800.0;

	@Override
	void taste() {
		System.out.println("Mangos are sweet");
	}

	public void qualities() {
		System.out.println("Mango is king of fruits");
	}
}

public class DownCastingPractice {
//	we cannot down cast newly created object
//	to perform down casting, first upcast the object to parent class then we can down cast that object explicitly
//  downcasting can only be achieved explicitly 
	public static void main(String[] args) {
//		Mango1 obj = new Fruit1();  // Type mismatch: cannot convert from Fruit1 to Mango1
//		Mango1 obj = (Mango1) new Fruit1(); // gives ClassCastException

		Fruit1 f1 = new Mango1(); // upcasting
//		Mango1 m1 = f1; // Type mismatch: cannot convert from Fruit1 to Mango1
		Mango1 m1 = (Mango1) f1; // explicit down casting
		System.out.println(m1.weight);
		System.out.println(m1.price);
		m1.taste();
		m1.qualities();
	}

}
