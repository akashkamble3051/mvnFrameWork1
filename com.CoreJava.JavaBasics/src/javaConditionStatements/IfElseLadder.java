package javaConditionStatements;

public class IfElseLadder {

	public static void main(String[] args) {
		int mark = 30;
		if (mark < 35) {
			System.out.println("Fail!");
		} else if (mark < 55) {
			System.out.println("Pass class");
		} else if (mark < 65) {
			System.out.println("Second class");
		} else if (mark < 75) {
			System.out.println("First class");
		} else if (mark <= 100) {
			System.out.println("Distinction");
		} else {
			System.out.println("Pleas provide valid  marks");
		}

	}

}

// print student result based on the marks
// 35 > mark -->Final
// 35 <= mark > 55 --> Pass class
// 55 <= mark > 65 --> Second class
// 65 <= mark > 75 --> First class
// 75 <= mark > 100 --> Distinction
// 100 < mark --> Please provide valid marks