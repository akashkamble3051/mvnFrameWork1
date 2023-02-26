package javaConditionStatements;

public class IfStatement {

	public static void printResult(int mark) {
		if (mark < 35) { // 25 < 35 --> true
			System.out.println("For " + mark + " result is : " + "Fail");
		}

		if (mark >= 35) { // 25 >= 35 --> false
			System.out.println("For " + mark + " result is : " + "Pass");
		}
	}

	public static void main(String[] args) {
		int mark = 25;
		IfStatement.printResult(mark);
		IfStatement.printResult(58);
	}

}
// if student marks are less than 35 then print fail
// if student marks are greater than or equal to 35 then print pass