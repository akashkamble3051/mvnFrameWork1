package javaConditionStatements;

public class SwitchCaseStatement2 {

	public static void main(String[] args) {
		String state = "GJ";
		switch (state) {
		case "MH":
			System.out.println("Capital city is Mumbai");
			break;

		case "GJ":
			System.out.println("Capital city is Gandhinagar");
			break;

		case "GA":
			System.out.println("Capital city is Panji");
			break;

		case "KA":
			System.out.println("Capital city is Bangalore");
			break;

		default:
			System.out.println("Please enter valid state code");
			break;
		}

	}

}
