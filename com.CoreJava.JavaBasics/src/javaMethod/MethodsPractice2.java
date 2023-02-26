package javaMethod;

public class MethodsPractice2 {
/*
access modifier		: public
non-access modifier	: static
return type			: void
name of the method	: additionOFNumber
parameters			: no parameters
*/
	public static void additonOfNumber() {
		
	}
	
	/*
	access modifier		: default
	non-access modifier	: static
	return type			: int
	name of the method	: multiplicationOfNumber
	parameters			: no parameter
	*/
	static int multiplicationOfNumber() {
		return 4;
	}
	
	/*
	access modifier		: private
	non-access modifier	: non-static
	return type			: double
	name of the method	: divisionOfNumber
	parameters			: double a, double b
	*/
	private double divisionOfNumber(double a, double b) {
		return 4.5;
	}
	
	/*
	access modifier		: protected
	non-access modifier	: final & static
	return type			: void
	name of the method	: createAccount
	parameters			: String name, char ch
	*/
	protected final static void createAccount(String name, char ch) {
		
	}
	
	/*
	access modifier		: private
	non-access modifier	: final & non-static
	return type			: boolean
	name of the method	: calculateResult
	parameters			: int maths, int english, int science
	*/
	private final boolean calculateResult(int maths, int english, int science) {
		return true;
	}
	
	/*
	access modifier		: default
	non-access modifier	: static
	return type			: String
	name of the method	: getStudentName
	parameters			: int rollNO
	*/
	static String getStudentName(int rollNo) {
		return "";
	}
	
	public static void main(String[] args) {
		

	}

}
