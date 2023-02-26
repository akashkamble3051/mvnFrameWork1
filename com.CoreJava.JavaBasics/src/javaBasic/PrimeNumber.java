package javaBasic;

public class PrimeNumber {

	public static void main(String[] args) {
		boolean flag = true;
		for (int i = 2; i <= 100; i++) {
			for (int j = i - 1; j >= 2; j--) {
				if (i % j == 0) {
					flag = false;
				}
			}
			if (flag) {
				System.out.println(i);
			}
			flag = true;
		}

	}

}

// Prime numbers --> they are only divisible by themself

// 2, 3, 5, 7, 11, 13, 17, 19, 23, 29,.....