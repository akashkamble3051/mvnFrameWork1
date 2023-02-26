package javaLoops;

public class BreakStatement2 {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i == 6) {
				break; // breaks outer for loop
			}
			for (int j = 0; j <= 5; j++) {
				if (j == 3) {
					break; // break inner for loop
				}
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
