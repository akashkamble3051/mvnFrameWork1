package javaDataTypes;

public class GlobalVariable1 {
	float f = 87.5f; // non-static global variable --> access specifier is default
	public int i; // non-static global variable --> access specifier is public

	protected static double d; // static global variable --> access specifier is protected
	private static boolean b = false; // static global variable --> access specifier is private

	public static void main(String[] args) {
//		public double d; // local variable, we cannot use access specifier/modifier with local variables
//		static int a = 5; // local variable, we cannot use static keyword with local variable
		int a = 5; // local variable
	}

}
