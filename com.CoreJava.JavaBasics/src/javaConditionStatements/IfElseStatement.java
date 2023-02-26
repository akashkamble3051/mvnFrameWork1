package javaConditionStatements;

public class IfElseStatement {

	public static void main(String[] args) {
		int age = 17;
		if (age >= 18) {
			System.out.println("You can vote"); // executed if condition is true
		} else {
			System.out.println("You can't vote"); // executed if condition is false
		}
	}

}
//If person age is greater than or equal to 18 then only he/she can vote
//Program should check age and print whether that person can vote or not