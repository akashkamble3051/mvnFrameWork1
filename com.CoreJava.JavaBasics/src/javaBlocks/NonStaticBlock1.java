package javaBlocks;

public class NonStaticBlock1 {
//	non-static block
	{
		System.out.println("first non-static block");
	}
	
//	non-static block
	{
		System.out.println("second non-static block");
	}

//	constructor
	NonStaticBlock1() {
		System.out.println("this is constructor");
	}

	public static void main(String[] args) {
		System.out.println("main method starts here");
		NonStaticBlock1 obj = new NonStaticBlock1();
	}
	
//	non-static block
	{
		System.out.println("third non-static block");
	}

}
