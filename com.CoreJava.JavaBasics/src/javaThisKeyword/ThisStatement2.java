package javaThisKeyword;

public class ThisStatement2 {
	ThisStatement2() {
		this(15); // call the integer parameterized constructor
		System.out.println("Zero parameterized constructor");
	}

	ThisStatement2(int a) {
		this(45.20); // call the double parameterized constructor
		System.out.println("Int parameterized constructor");
	}

	ThisStatement2(double d) {
		System.out.println("Double parameterized constructor");
	}

	public static void main(String[] args) {
		ThisStatement2 obj = new ThisStatement2(); // calling zero parameterized constructor
	}

}
