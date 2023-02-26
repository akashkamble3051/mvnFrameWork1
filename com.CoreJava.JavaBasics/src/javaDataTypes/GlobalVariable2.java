package javaDataTypes;

public class GlobalVariable2 {
//	non-static variables, and they are only declared
//	access specifier for all variable is default
//  Compiler will assign default values to global variables if they are not initialized
	int i;
	double d;
	char ch;
	boolean bl;
	String str;

	public static void main(String[] args) {
//  how to create the class object
//		class_name object_variable_name = new class_name();
		GlobalVariable2 obj = new GlobalVariable2();

		System.out.println(obj.i);
		System.out.println(obj.d);
		System.out.println(obj.ch);
		System.out.println(obj.bl);
		System.out.println(obj.str);
	}

}
