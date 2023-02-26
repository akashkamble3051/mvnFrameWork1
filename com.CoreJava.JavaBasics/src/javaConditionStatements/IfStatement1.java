package javaConditionStatements;

public class IfStatement1 {

	public static void main(String[] args) {
		boolean flag = true;

		if (flag) {
			System.out.println("flag is true");
		}

		flag = false;
// 		! is logical not operator --> it will reverse the boolean value
//		!true --> false, !false --> true
		if (!flag) {
			System.out.println("flag is false");
		}

		if (true) {

		}
	}

}
