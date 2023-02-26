package oopsInheritance;

class Mobile { // parent class
	int ram;

	void displayBrand() {
		System.out.println("Mobile Brand");
	}
}

class IPhone extends Mobile {
//	mobile class property will be inherited here
}

class Samsung extends Mobile {
//	mobile class property will be inherited here
}

class OnePlus extends Mobile {
//	mobile class property will be inherited here
}

public class Inheritance4 {
	public static void main(String[] args) {
		OnePlus obj = new OnePlus();
		System.out.println(obj.ram);
		obj.displayBrand();

		Samsung obj1 = new Samsung();
		System.out.println(obj1.ram);
		obj1.displayBrand();

		IPhone obj2 = new IPhone();
		System.out.println(obj2.ram);
		obj2.displayBrand();
	}
}
