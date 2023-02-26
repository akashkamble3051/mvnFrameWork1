package javaPrograms;

public class CountNumberOfDigits {
	public static void countDigit(int num) {
		int counter = 0, temp = num;
		while (num != 0) {
			counter++;
			num = num / 10;
		}
		System.out.println(temp + " number of digits are " + counter);
	}

	public static void main(String[] args) {
		CountNumberOfDigits.countDigit(564285);
	}

}
