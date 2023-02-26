package javaMethod;

public class MethodsPractice9 {

	public int additionOfNum(int a, int b) { // a = 15 & b = 16
		return (a + b);
	}

	public int subtraction(int a, int b) {
		return (a - b);
	}

	public static void main(String[] args) {
		MethodsPractice9 obj = new MethodsPractice9();

		System.out.println("Callin addition method : " + obj.additionOfNum(15, 16));

		System.out.println("Calling subtraction method : " + obj.subtraction(45, 30));
	}

}
