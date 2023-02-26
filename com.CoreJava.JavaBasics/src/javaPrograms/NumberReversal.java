package javaPrograms;

public class NumberReversal {
	public int reverseNumber(int num) {
		int revNum = 0, rem;

		while (num != 0) {
			rem = num % 10;
			revNum = revNum * 10 + rem;
			num = num / 10;
		}

		System.out.println("Reveser no : " + revNum);
		return revNum;
	}

	public static void main(String[] args) {
		int num = 123456789;
		NumberReversal obj = new NumberReversal();
		obj.reverseNumber(num);
		obj.reverseNumber(159);
	}
}
