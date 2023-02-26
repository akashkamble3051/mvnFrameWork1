package javaMethod;

public class MethodsPractice4 {

	public static void additionOfNumber(int a, int b) {
//		int a & int b are local variables of this method
		int result = a + b;
		System.out.println("Additon is : " + result);
	}

	public static void main(String[] args) {
		MethodsPractice4.additionOfNumber(15, 20);
	}

}
