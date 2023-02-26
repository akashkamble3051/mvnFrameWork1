package javaBlocks;

public class StaticBlocks1 {
	static {
		System.out.println("first static block");
	}
	
	static {
		System.out.println("second static block");
	}

	public static void main(String[] args) {
		System.out.println("main method starts here");
	}
	
	static {
		System.out.println("third static block");
	}

}
