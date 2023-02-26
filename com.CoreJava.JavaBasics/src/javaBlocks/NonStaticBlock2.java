package javaBlocks;

public class NonStaticBlock2 {

	boolean flag; // non-static variable, with default value as false
//	non-static block
	{
		flag = true;
		System.out.println("first non-static block");
	}

//	constructor
	NonStaticBlock2() {
		System.out.println("this is constructor");
	}

	public static void main(String[] args) {
		System.out.println("main method starts here");
		NonStaticBlock2 obj = new NonStaticBlock2();
		System.out.println(obj.flag);
	}
}
