package javaFinalKeyword;

public class FinalKeywordPractice3 {
	final double d; // blank final variable, compiler will not initialize it

//	non-static block
	{
		d = 55;
	}
	
	FinalKeywordPractice3(){
//		d = 90; // not allowed since it is already initialized in the non-static block
	}

	public static void main(String[] args) {
		FinalKeywordPractice3 obj = new FinalKeywordPractice3();
		System.out.println(obj.d); // 55

	}

}
