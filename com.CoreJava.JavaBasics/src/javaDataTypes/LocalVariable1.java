package javaDataTypes;

public class LocalVariable1 {

	public static void additionOfNumber() {
		int a = 10, b = 20, result;
		result = a + b;
		System.out.println(result);
	}

	public static void main(String[] args) {
		double d = 50.40, d1 = 60.30, add;
		add = d + d1;
//		result = a + b; // it gives compile time error since a, b & result are local variable of another method
 		System.out.println(add);
 		
// 		int a = 10, b = 40, result; we can use the same name for variable by declaring them
		
		LocalVariable1.additionOfNumber();
	}

}

// java program execution starts from main method, and it will execute main method
// line by line
