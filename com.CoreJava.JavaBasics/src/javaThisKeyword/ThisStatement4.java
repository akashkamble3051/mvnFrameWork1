package javaThisKeyword;

public class ThisStatement4 {
	ThisStatement4() {
//		this();  // Recursive constructor invocation, it will lead to infinite loop
		this(10);
		System.out.println("Zero parameterized constructor");
	}

	ThisStatement4(int a) {
//		this(); // Recursive constructor invocation, it will lead to infinite loop
		this(9.54);
		System.out.println("Int parameterized constructor");
	}

	ThisStatement4(double d) {
//		this(5);
		System.out.println("Double parameterized constructor");
	}

	public static void main(String[] args) {
		ThisStatement4 obj = new ThisStatement4();
	}

}
