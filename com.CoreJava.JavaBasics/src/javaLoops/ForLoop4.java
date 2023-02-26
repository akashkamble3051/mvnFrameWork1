package javaLoops;

public class ForLoop4 {

	public static void main(String[] args) {
		int i = 2;

//		for (; i <= 100; i = i + 2) {
//			System.out.println(i);
//		}

//		to print the even number
		for (; i <= 100; i++) {
			if (i % 2 == 0) { // (i % 2) will give remainder when i is divided by 2
				System.out.println(i);
			}
		}

//		to print the odd number
		System.out.println("*******");
		i = 1;
		for (; i <= 100; i++) {
			if (i % 2 != 0) { // (i % 2) will give remainder when i is divided by 2
				System.out.println(i);
			}
		}

	}

}
