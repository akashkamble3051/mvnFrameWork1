package oopsAbstraction;

public interface Interface5 {
//	since java 8 interface can have static or default method

	default void defaultMethodPractice() {
		System.out.println("This is default method of interface");
	}

	static void staticMethodPractice() {
		System.out.println("This is static method of interface");
	}

	public static void main(String[] args) {
		Interface5.staticMethodPractice();
//		Interface5.defaultMethodPractice();
	}
}

class SubClassForInterface implements Interface5 {
	public static void main(String[] args) {
		Interface5.staticMethodPractice();

		Interface5 obj = new SubClassForInterface(); // upcasting
		obj.defaultMethodPractice();
	}
}