package javaTypeCasting;

class Fruit {
	int weight;

	void taste() {
		System.out.println("Print fruit taste");
	}
}

class Mango extends Fruit {
	double price = 800.0;

	@Override
	void taste() {
		System.out.println("Mangos are sweet");
	}

	public void qualities() {
		System.out.println("Mango is king of fruits");
	}
}

public class UpCastingPractice {

	public static void main(String[] args) {
		Fruit obj = new Mango(); // auto up casting or implicit up casting
		System.out.println(obj.weight);
//		System.out.println(obj.price); // not accessible since variable price is hidden
		obj.taste();
//		obj.qualities(); not accessible since qualities() is hidden

		Fruit obj1 = (Fruit) new Mango(); // explicit up casting

		Mango m1 = new Mango();
		Fruit f1 = (Fruit) m1; // explicit up casting

		Fruit f2 = m1; // auto up casting or implicit up casting
		System.out.println(f2.weight);
//		System.out.println(f2.price);
		f2.taste();
//		f2.qualities();
	}

}
