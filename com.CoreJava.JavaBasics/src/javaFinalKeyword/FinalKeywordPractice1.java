package javaFinalKeyword;

public class FinalKeywordPractice1 {
	
	FinalKeywordPractice1(){
		final int p; // local variable for constructor, blank final variable
		p = 65;
//		p = 75;
	}

	public static void main(String[] args) {
		final int i; // blank final variable
//		System.out.println(i); // without initializing we cannot use it
		
//		blank final variable can be initialized only once in the method or block where it defined
		i = 50;
		System.out.println(i);
		
//		i = 60; // not allowed since it is already initialized

	}

}
