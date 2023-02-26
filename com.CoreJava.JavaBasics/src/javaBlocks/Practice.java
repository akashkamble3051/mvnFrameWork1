package javaBlocks;

public class Practice {
//	static block
	static {
		System.out.println("Static block");
	}

//	Non-static block
	{
		System.out.println("Non-static block");
	}

//	constructor
	Practice() {
		System.out.println("Constructor");
	}

	public static void main(String[] args) {
		System.out.println("main methd starts here");
		Practice obj = new Practice();
	}
}

//Execution order
// 1. static block
// 2. main method starts
// 3. non-static block
// 4. constructor