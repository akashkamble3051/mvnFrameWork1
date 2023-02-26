package javaOperators;

public class TernaryOperator {

	public static void main(String[] args) {
		int a = 70, b = 60;
		int c = 80;
//		if (a > b)
//			System.out.println("Greater number is : " + a);
//		else
//			System.out.println("Greater number is : " + b);

//		ternary operator
		int max = (a > b) ? a : b;
		System.out.println("Greater number is : " + max);

		int min = (a < b) ? a : b;
		System.out.println("Smallest number is : " + min);

		max = (a > b && a > c) ? a : (b > a && b > c) ? b : c;
		System.out.println("Greater number is : " + max);
	}

}
