package javaMethod;

public class MethodsPractice8 {

	public String displayName() {
		String str = "Java";
		return str; // return value of str
	}
	
	public String displayName1() {
		return "ABC"; // return string literal
	}

	public static void main(String[] args) {
		MethodsPractice8 obj = new MethodsPractice8();
		System.out.println(obj.displayName());

		System.out.println(obj.displayName1());
	}

}
