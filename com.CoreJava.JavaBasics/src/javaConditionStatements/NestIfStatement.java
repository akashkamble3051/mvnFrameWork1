package javaConditionStatements;

public class NestIfStatement {

	public static void main(String[] args) {
		int mark = 25;

		if (mark >= 35) {
			System.out.println("Pass");
			if (mark >= 60) {
				System.out.println("First Class");
			}
		}

		if (mark < 35) {
			System.out.println("Fail");
		}

	}

}
// If student mark is greater than or equal to 35 then print pass
// If student is pass then check if mark is greater than or equal to 60 then print First Class
// If student mark is less than 35 then print fail