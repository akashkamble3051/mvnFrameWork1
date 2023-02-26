package javaConstructor;

public class Constructor3 {
	int a; // global variable --> compiler assigns default value since not initialized
	double d; // global variable

	Constructor3() { // zero parameterized user defined constructor
//		initializing global variables using constructor with specific values
		a = 15;
		d = 40.5;
	}

	public static void main(String[] args) {
		Constructor3 obj = new Constructor3();

		System.out.println(obj.a);
		System.out.println(obj.d);
	}

}
