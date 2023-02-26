package javaThisKeyword;

public class ThisStatement3 {
	ThisStatement3() {
		System.out.println("Zero parameterized constructor");
	}

	ThisStatement3(int a) {
		this(); // calls zero parameterized constructor
		System.out.println("Int parameterized constructor");
	}

	ThisStatement3(double d) {
		this(8); // calls int parameterized constructor
		System.out.println("Double parameterized constructor");
	}

	public static void main(String[] args) {
//	create object in such a way that it should execute zero parameterized constructor first then int parameterized
//	and then double parameterized
		ThisStatement3 obj = new ThisStatement3(5.4); // calling double parameterized constructor
	}

}
