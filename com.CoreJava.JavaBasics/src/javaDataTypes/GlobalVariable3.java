package javaDataTypes;

public class GlobalVariable3 {
	// static variable
	static int a;
	public static double d = 15.21;
	static boolean bl;
	static float f;
	static char ch;
	static String str;

	public static void main(String[] args) {
		GlobalVariable3 obj = new GlobalVariable3();

		System.out.println(obj.a); // System.out.println(GlobalVariable3.a); internally compiler will do this
		System.out.println(GlobalVariable3.d); // Recommended way to access static variable
		System.out.println(bl); // System.out.println(GlobalVariable3.bl); internally compiler will do this
		System.out.println(GlobalVariable3.f);
		System.out.println(GlobalVariable3.ch);
		System.out.println(GlobalVariable3.str);
	}

}

// shortcut to write System.out.println() is
// write syso
// press ctrl + space
// press enter


// it is recommended to use static variables using class name, so that it will not lead 
// to any confusion if we use that variable in some other class, where variable with same name
// will exist.
