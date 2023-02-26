package javaSuperKeyword;

// in Java Object class is parent most / supermost class
// every class in java inherit the Object class directly or indirectly

class Mobile { // parent class / superclass (Mobile class inherit Object class directly)
	Mobile() {
//		super(); // it will present here by-default, and it will call zero parameterized constructor of parent class
		System.out.println("Mobile class constructor");
	}
}

class Oneplus extends Mobile{ // child class / subclass (Oneplus class inherit Object class indirectly through Mobile class)
	Oneplus() {
//		super(); // it will present here by-default, and it will call zero parameterized constructor of parent class
		System.out.println("Oneplus class constructor");
	}
}

public class SuperStatement2 {

	public static void main(String[] args) {
		Oneplus obj = new Oneplus();
	}

}
