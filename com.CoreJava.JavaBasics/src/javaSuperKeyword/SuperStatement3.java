package javaSuperKeyword;

// Constructor chaining between parent class and child class constructor is must for inheritance
class Laptops {
//	Laptops() {
////		super(); // it will call zero parameterized constructor of Object class
//		System.out.println("zero parameterized constructor of Laptops class");
//	}

	Laptops(int a) {
//		super(); // we can write this zero parameterized super statement explicitly as well
		System.out.println("int parameterized constructor of Laptops class");
	}

	Laptops(double p, boolean flag) {
//		super(); // we can write this zero parameterized super statement explicitly as well
		System.out.println("double & boolean parameterized constructor of Laptops class");
	}
}

class Lenovo extends Laptops {
	Lenovo() {
		super(10); // it will call int parameterized constructor of Laptops class
		System.out.println("zero parameterized constructor of Lenovo class");
	}

	Lenovo(double d) {
		super(20); // it will call int parameterized constructor of Laptops class
		System.out.println("double parameterized constructor of Lenovo class");
	}

	Lenovo(char ch) {
		super(55.20, true); // calling double & boolean parameterized constructor of Laptops class
		System.out.println("char parameterized constructor of Lenovo class");
	}

}

public class SuperStatement3 {

	public static void main(String[] args) {
		Lenovo obj = new Lenovo(); // calling zero parameterized constructor of Lenovo class

		System.out.println("***************");
		Lenovo obj1 = new Lenovo(15.4); // calling double parameterized constructor of Lenovo class
		
		System.out.println("***************");
		Lenovo obj2 = new Lenovo('A'); // calling char parameterized constructor of Lenovo class
	}

}
