package javaMemoryManagement;

public class MemoryManagement {
	static int i = 40; // static global variable
	static double d; // static global variable

	float f = 78.25f; // non-static global variable
	boolean bl; // non-static global variable

	public static void staticMethod() { // static method

	}

	public void nonStaticMethod() { // non-static method

	}

	public static void main(String[] args) {
		MemoryManagement obj = new MemoryManagement();
		MemoryManagement obj1 = new MemoryManagement();

		obj.f = 50.25f;
		obj1.bl = true;

		MemoryManagement.d = 65.23;

	}

}