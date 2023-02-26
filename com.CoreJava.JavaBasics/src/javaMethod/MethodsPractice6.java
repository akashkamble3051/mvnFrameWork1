package javaMethod;

public class MethodsPractice6 {
//	non-static method
	public void additionOfNum() {
		int a = 30, b = 10;
		System.out.println("Addition of numbers is : " + (a + b));
	}

	public static void main(String[] args) {
		MethodsPractice6 obj = new MethodsPractice6();		
		obj.additionOfNum(); // non-static method is called using object reference variable
	}

}
