package javaBlocks;

public class StaticBlocks2 {
	static double avgMarks; // static variable, since it is not initialized, compiler will assign it its
							// default value
	int i; // non-static variable

	static {
		avgMarks = 35.50;
//		i = 80; // cannot be accessed since it is non-static
		System.out.println("first static block");
	}

	public static void main(String[] args) {
		System.out.println("main method starts here");
		System.out.println(StaticBlocks2.avgMarks);
	}
}
