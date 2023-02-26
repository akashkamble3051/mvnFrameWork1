package javaLoops;

public class BreakStatement {

	public static void main(String[] args) {
		int i = 1;
		for (; i <= 20; i++) {
			System.out.println(i);
			if (i == 10) {
				break;
			}
		}

	}

}
// Print number from 1 - 20
// if number 10 is arrived then loop should stop