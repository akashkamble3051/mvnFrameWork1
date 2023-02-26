package javaMethod;

public class MethodsPractice5 {
//	static method
	public static void additionOfNum() {
		int a = 10, b = 20;
		System.out.println("Addition is : " + (a + b));
	}

	public static void main(String[] args) {
		additionOfNum(); // calling static method directly by method name {Not recommended}
							// compiler --> MethodsPractice5.additionOfNum();

		MethodsPractice5.additionOfNum(); // calling static method using class name {Recommended}

		MethodsPractice5 obj = new MethodsPractice5(); // obj is reference variable of the object
		obj.additionOfNum(); // calling static method using reference variable of class object {Not
								// recommended}
								// compiler --> MethodsPractice5.additionOfNum();
	}
}

// java program execution starts from main method, and it will execute statements written in main method
// line by line