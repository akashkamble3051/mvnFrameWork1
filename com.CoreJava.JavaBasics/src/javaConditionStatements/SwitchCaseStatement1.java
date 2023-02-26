package javaConditionStatements;

public class SwitchCaseStatement1 {

	public void calculatorOperation(char ch, int a, int b) {
		int result = 0;
		switch (ch) {

		case '+':
			result = a + b;
			System.out.println("Addition : " + result);
			break;

		case '-':
			result = a - b;
			System.out.println("Subtraction : " + result);
			break;

		case '*':
			result = a * b;
			System.out.println("Multiplication : " + result);
			break;

		case '/':
			result = a / b;
			System.out.println("Division : " + result);
			break;

		case '%':
			result = a % b;
			System.out.println("Remainder : " + result);
			break;
		default:
			System.out.println("Please provide valid operator");
			break;
		}

	}

	public static void main(String[] args) {
		SwitchCaseStatement1 obj = new SwitchCaseStatement1();
		obj.calculatorOperation('/', 50, 20);
		obj.calculatorOperation('%', 50, 20);
	}

}
