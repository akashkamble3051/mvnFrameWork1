package javaOperators;

public class AssignementOp1 {

	public static void main(String[] args) {
		int a;
//		int b = a;
		int b = 45;

		a = 10;
		System.out.println("Before addition : " + a);
//		a = a + 5;
		a += 5; // short hand operator or compound statement
		System.out.println("After addition : " + a); // 15

//		a = a - 5;
		a -= 5;
		System.out.println("After subtraction : " + a); // 10

//		a = a * 8;
		a *= 8;
		System.out.println("After multiplication : " + a); // 80

//		a = a / 8;
		a /= 8;
		System.out.println("After division : " + a); // 10

//		a = a % 7;
		a %= 7;
		System.out.println("After remainder : " + a); // 3
	}

}
