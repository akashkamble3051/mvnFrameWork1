package javaFinalKeyword;

public class FinalKeywordPractice4 {
	final static boolean flag; // blank final variable

//	static block
	static {
		flag = true; // initializing blank final variable
	}

//	static block
	static {
//		flag = true; // not allowed since final and already it is initialized
	}

	public static void main(String[] args) {
		System.out.println(FinalKeywordPractice4.flag);
	}

}
