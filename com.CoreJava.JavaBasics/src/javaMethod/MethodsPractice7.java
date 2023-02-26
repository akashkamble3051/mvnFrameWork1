package javaMethod;

public class MethodsPractice7 {

	public static int additionOfNumber() {
		int a = 50, b = 30;
		int result = a + b;
		return result; // it will return the value of result variable
	}

	public static void main(String[] args) {
//		1. only calling the method
		MethodsPractice7.additionOfNumber();

//		2. only printing the return value of the method
		System.out.println("Addition: " + MethodsPractice7.additionOfNumber());

//		3. if required for future one can store the return value
		int add = MethodsPractice7.additionOfNumber();
		System.out.println("Add: " + add);
	}

}
