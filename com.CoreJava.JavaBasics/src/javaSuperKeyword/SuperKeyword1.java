package javaSuperKeyword;

// super keyword can be used in non-static method, non-static block or constructor
// super keyword cannot used in static method or static block

class Mumbai { // superclass or parent class
	long population = 6000;

	void display() {
		System.out.println("Mumbai is capital of Maharashtra");
	}
}

class Pune extends Mumbai { // subclass or child class
	long population = 5000;

	void display() {
		System.out.println("Pune is IT-Hub of Maharashtra");
//		as both Mumbai and Pune class have variable with same name, to differentiate between them we will super keyword
		System.out.println("Mumbai population : " + super.population); // accessing parent class variable
		System.out.println("Pune population : " + population);
//		super.display();
	}

	void callParentClassMembers() {
		System.out.println(super.population);
//		display(); // it will call display() of Pune class {same class}
		super.display(); // it will call display() of Mumbai class
	}
}

public class SuperKeyword1 {

	public static void main(String[] args) {
		Pune obj = new Pune();
		obj.display();
		obj.callParentClassMembers();
	}

}
