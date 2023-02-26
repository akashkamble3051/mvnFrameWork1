package javaThisKeyword;

public class ThisKeyword2 {
	char ch = 'A';
	boolean flag;

	void displayCharValue(char ch) {
		System.out.println("Local char value is : " + ch);
		System.out.println("Global char value is : " + this.ch);
	}

	void displayBooleanValue(boolean flag) {
		System.out.println("Local boolean value is : " + flag);
		System.out.println("Global boolean value is : " + this.flag);
	}
	
	public void callOtherMethod() {
//		this keyword can also be used to call or access non-static member of same class
		this.displayCharValue('Z');
		this.displayBooleanValue(true);
	}

	public static void main(String[] args) {
		ThisKeyword2 obj = new ThisKeyword2();
		obj.callOtherMethod();
	}

}
