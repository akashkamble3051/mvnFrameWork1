package javaFinalKeyword;

public class FinalKeywordPractice2 {
//	we can use any access specifier with global variable, also we can use static and non-static keyword 
	final int a; // compiler will initialize it since it is not initialized
//	variable a is blank final variable

	FinalKeywordPractice2() {
		a = 5; // initializing blank final variable
//		a = 8;
	}
	
	FinalKeywordPractice2(int p) {
		a = p; // initializing blank final variable
//		a = 8;
	}

	public static void main(String[] args) {
		FinalKeywordPractice2 obj = new FinalKeywordPractice2(); // calling zero parameterized constructor
		System.out.println(obj.a); //5
		FinalKeywordPractice2 obj1 = new FinalKeywordPractice2(110); // calling int parameterized constructor
		System.out.println(obj1.a); // 110
	}

}
