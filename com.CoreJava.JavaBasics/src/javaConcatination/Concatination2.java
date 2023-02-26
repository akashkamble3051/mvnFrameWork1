package javaConcatination;

// VBODMAS
public class Concatination2 {

	public static void main(String[] args) {
		int a = 10, b = 20;
		System.out.println("Hello Java " + a + b); // String + int number + in number
		System.out.println(a + b + " Hello Java"); // 30 Hello Java
		System.out.println(a + " Hello Java " + b); // 10 Hello Java 20

		int c = 5;
		int d = a + b + c;

		System.out.println("Hello Java " + a + b + c); // Hello Java 10205
		System.out.println(a + b + " Hello Java " + c); // 30 Hello Java 5
		System.out.println("Hello Java " + d); // Hello Java 35
		System.out.println("Hello Java " + (a + b + c)); // Hello Java 35
		System.out.println("Hello Java " + a + " " + b + " " + c);
	}

}

// Adding string with number is called concatenation 

// Hello Java + 10 = Hello Java10
// Hello Java10 + 20 = Hello Java1020

// 10 + 20 = 30
// 30 +  Hello Java = 30 Hello Java

// Assignment
// int a = 15, b = 20;
// int result = a + b;
// Output 15 + 20 = 35