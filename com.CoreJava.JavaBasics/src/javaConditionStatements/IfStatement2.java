package javaConditionStatements;

public class IfStatement2 {
	static boolean flag = true;

	public static void main(String[] args) {
		if (IfStatement2.flag) {
			System.out.println("Flag is true");
		}

		IfStatement2.flag = false;
		
		if (IfStatement2.flag) {
			System.out.println("*******");
		}
	}

}
