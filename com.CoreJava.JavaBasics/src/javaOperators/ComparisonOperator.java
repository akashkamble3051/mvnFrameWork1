package javaOperators;

public class ComparisonOperator {

	public static void main(String[] args) {
		int a = 20, b = 22, c = 18, d = 20;

		System.out.println(a == b); // false
		System.out.println(a == d); // true

		char ch1 = 'a', ch2 = 'A', ch3 = 'a';
		System.out.println("ch1 == ch2 : " + (ch1 == ch2)); // false {compared based on ascii value}
		System.out.println("ch1 != ch2 : " + (ch1 != ch2)); // true
		System.out.println("ch1 < ch2 : " + (ch1 < ch2)); // false

		boolean flag1 = true, flag2 = false, flag3 = true;
		System.out.println(flag1 == flag3);
//		System.out.println(flag1 > flag2); <, <=, >, >=  are not applicable for boolean values

		System.out.println("a == d && a >= c : " + (a == d && a >= c)); // true && true --> true
		System.out.println("a == b && c <= d : " + (a == b && c <= d));

		System.out.println("ch1 == ch3 || ch1 == ch2 : " + (ch1 == ch3 || ch1 == ch2)); // true || false --> true
		System.out.println("flag1 == flag3 || flag1 != flag2 : " + (flag1 == flag3 || flag1 != flag2)); // true
	}

}

// multiple conditions -->
// logical AND operator --> && --> it returns true if all conditions are true
// logical OR operator --> || --> it returns true if atleast one conditions is true

// condition1 && conditions2 ==> true && true --> true
// condition1 && conditions2 ==> false && true --> false
// condition1 && conditions2 ==> true && false --> false
// condition1 && conditions2 ==> false && false --> false
// condition1 && conditions2 && conditions3 ==> true && true && true --> true

// condition1 || conditions2 ==> true || true --> true
// condition1 || conditions2 ==> false || true --> true
// condition1 || conditions2 ==> true || false --> true
// condition1 || conditions2 ==> false || false --> false
