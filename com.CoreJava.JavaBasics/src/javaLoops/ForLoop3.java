package javaLoops;

public class ForLoop3 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;

		for (; i <= 50;) {
			sum = sum + i;
			i++;
		}
		System.out.println(sum);
	}

}
// I want to add first 50 numbers