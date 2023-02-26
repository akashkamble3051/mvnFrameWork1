package javaLoops;

public class FibonaciSeries {

	public static void main(String[] args) {
		int n1 = 0, n2 = 1, sum = 0;

		while (n1 <= 200) {
			System.out.print(n1 + " ");
			sum = n1 + n2;
			n1 = n2;
			n2 = sum;
		}

	}

}

// 0 1 1 2 3 5 8 13 ....
// 0 + 1 = 1
// 1 + 1 = 2
// 2 + 1 = 3
// 3 + 2 = 5
// .....