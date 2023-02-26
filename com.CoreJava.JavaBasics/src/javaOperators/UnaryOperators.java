package javaOperators;

public class UnaryOperators {

	public static void main(String[] args) {
		int a = 15;
//		unary minus operator
		System.out.println(-a);
		int b = -a;
		System.out.println(b);

//		unary plus
		double d = 25;
		System.out.println(+d);
		double e = +d;
		System.out.println(e);

//		increment operator
//		post-increment operator
		int i = 1;
		int j = i++; // i++ --> i = i + 1
		System.out.println(i + "\n" + j);

		i = 1; // 2, 3
		j = i++ + i++; // 1 + 2 = 3
		System.out.println(i + "\n" + j); // 3 3

		i = 0; // 1, 2
		j = i++ + i + i++ + i; // 0 + 1 + 1 + 2
		System.out.println(i + "\n" + j); // 2 4

		i = 2; // 3, 4, 5
		j = i + i++ + i++ + i++; // 2 + 2 + 3 + 4 = 11
		System.out.println(i + "\n" + j); // 5 11

//		pre-increment operator {value is incremented first then it is used}
		i = 1; // 2
		j = ++i; // 2
		System.out.println(i + "\n" + j);

		i = 1; // 2, 3, 4
		j = ++i + ++i + ++i; // 2 + 3 + 4
		System.out.println(i + "\n" + j); // 4 9, 2 6,

//		post-decreament operator
		i = 3; // 2, 1,
		j = i-- + i-- + i; // 3 + 2 + 1
		System.out.println(i + "\n" + j); // 1 6,

		i = 5; // 4, 3 , 2
		j = i-- + i + i-- + i--; // 5 + 4 + 4 + 3
		System.out.println(i + "\n" + j); // 2 14, 2 16, 2 13

//		pre-dcrement operator
		i = 3; // 2
		j = --i; // 2
		System.out.println(i + "\n" + j); // 2 2

		i = 4; // 3, 2, 1
		j = --i + --i + --i; // 3 + 2 + 1
		System.out.println(i + "\n" + j); // 1 6

		i = 2; // 3, 4, 3, 2 , 1
		j = ++i + i++ + --i + --i + i + i--; // 3 + 3 + 3 + 2 + 2 + 2 = 15
		System.out.println(i + "\n" + j); // 1 15
	}

}
