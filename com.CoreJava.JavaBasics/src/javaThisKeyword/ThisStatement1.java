package javaThisKeyword;

public class ThisStatement1 {
	ThisStatement1() {
		this(15); // call the integer parameterized constructor
//		this(20.15); // Constructor call must be the first statement in a constructor
		System.out.println("Zero parameterized constructor");
	}

	ThisStatement1(int a) {
		System.out.println("Int parameterized constructor");
	}

	ThisStatement1(double d) {
		System.out.println("Double parameterized constructor");
	}

	public static void main(String[] args) {
		ThisStatement1 obj = new ThisStatement1(); // calling zero parameterized constructor
	}

}
