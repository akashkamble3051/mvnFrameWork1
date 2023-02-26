package javaConditionStatements;

public class IfStatement3 {

	public static void main(String[] args) {
		int age = 19;

		if (age >= 18) {
			System.out.println("You can vote");
		}

		if (age < 18) {
			System.out.println("You can't vote");
		}
	}

}
// If person age is greater than or equal to 18 then only he/she can vote
// Program should check age and print whether that person can vote or not