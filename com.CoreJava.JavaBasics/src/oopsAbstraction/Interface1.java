package oopsAbstraction;

interface Laptop {
//	Laptop is an interface
//	interface does not contains any constructor
//	We cannot create the object of interface

	int RAM = 8; // public static final int RAM = 8;

	void displayStorageStatus(); // public abstract void displayStorageStatus();

//	protected void display();	
//	we cannot define any method in interface as private or protected
}

class Lenovo implements Laptop {
//	public static final int RAM = 8;
//	public abstract void displayStorageStatus();

	public void displayStorageStatus() {
		System.out.println("60% storage used");
	}
}

public class Interface1 {

	public static void main(String[] args) {
		Laptop obj = new Lenovo();
		System.out.println(Laptop.RAM); // accessing through interface
		System.out.println(Lenovo.RAM); // accessing through class
		obj.displayStorageStatus();
	}

}
