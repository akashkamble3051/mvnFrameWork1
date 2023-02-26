package javaConstructor;

public class Constructor2 {
//	since we have defined a constructor explicitly, therefore compiler will not add default constructor here.
	Constructor2() { // its a zero parameterized user-defined constructor
//		super(); // this will be added by compiler after compilation
		System.out.println("Inside the constructor");
		System.out.println("hello I am learning Java");
	}

	public static void main(String[] args) {
		System.out.println("main method starts here");

		Constructor2 obj = new Constructor2(); // creating object

		System.out.println("main method ends here");
	}

}