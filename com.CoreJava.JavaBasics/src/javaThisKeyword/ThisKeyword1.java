package javaThisKeyword;

public class ThisKeyword1 {
	int a; // 25			// non-static, default, declared, global
	int b; // 15

	ThisKeyword1(int a, int b) { // local variables
//		here global variable and local variable have same name
//		to differentiate between local and global variables with same name we are using this keyword
		this.a = a; // initialize global variable
		this.b = b;
	}

	public void addOfNum(int a, int b) { // local variables
		int addLocal = a + b; 
		System.out.println("Addition of local variables is : " + addLocal); // 100

		int addGlobal = this.a + this.b;
		System.out.println("Addition of global variables is : " + addGlobal); // 40
	}

	public static void main(String[] args) {
		ThisKeyword1 obj = new ThisKeyword1(25, 15);
		obj.addOfNum(75, 25);
	}

}
