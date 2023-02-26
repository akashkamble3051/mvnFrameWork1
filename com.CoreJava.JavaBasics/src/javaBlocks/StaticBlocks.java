package javaBlocks;

public class StaticBlocks {
	static double d = 12.45;
	static {
		System.out.println(d);
		System.out.println("first static block");
	}

	public static void main(String[] args) {
		System.out.println("main method starts here");

	}

}
