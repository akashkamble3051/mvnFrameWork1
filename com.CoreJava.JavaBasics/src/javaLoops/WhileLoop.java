package javaLoops;

public class WhileLoop {

	public static void main(String[] args) {
		int i = 1;
		while (i <= 300) {
			if (i % 6 == 0) {
				System.out.println(i);
			}
			i++;
		}
	}

}

// I want to print the numbers which are divisible by 6 between 1 - 300
// While loop is called entry control loop since it check the condition first