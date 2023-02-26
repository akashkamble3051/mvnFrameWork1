package javaBlocks;

public class NonStaticBlock {
	int i = 67;
//	non-static block
	{
		System.out.println(i);
		System.out.println("first non-static block");
	}

//	constructor
	NonStaticBlock() {
		System.out.println("this is constructor");
	}

	public static void main(String[] args) {
		System.out.println("main method starts here");
		NonStaticBlock obj = new NonStaticBlock();
	}

}

// main method starts here
// first non-static block
// this is constructor