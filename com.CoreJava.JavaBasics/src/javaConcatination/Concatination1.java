package javaConcatination;

public class Concatination1 {
//	access specifier, non-static
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	char ch;
	boolean bl;
	String str;

	public static void main(String[] args) {
//		class_name object_reference_variable = new constructor_calling;
		Concatination1 obj = new Concatination1();
		System.out.println("Byte b = " + obj.b);
		System.out.println("Short s = " + obj.s);
		System.out.println("Int i = " + obj.i);
		System.out.println("Long l = " + obj.l);
		System.out.println("Float f = " + obj.f);
		System.out.println("Double d = " + obj.d);
		System.out.println("Char ch = " + obj.ch);
		System.out.println("Boolean bl = " + obj.bl);
		System.out.println("String str = " + obj.str);
	}

}
