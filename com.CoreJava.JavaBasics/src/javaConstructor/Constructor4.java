package javaConstructor;

public class Constructor4 {
//	compiler will assign default value, if global variables are not initialized.
	int i; // 0
	boolean flag; // false
	double d; // 0.0
	String str; // null

//	we can define access specifier with constructor
//	user defined parameterized constructor
	public Constructor4(int a, boolean flag1) {
		i = a;
		flag = flag1;
	}

	public Constructor4(double d1, String str1) {
		d = d1;
		str = str1;
	}

	Constructor4(int p, boolean q, double r, String s) {
		i = p;
		flag = q;
		d = r;
		str = s;
	}

	public static void main(String[] args) {
		Constructor4 obj = new Constructor4(60, true);
		System.out.println(obj.i); // 60
		System.out.println(obj.flag); // true
		System.out.println(obj.d); // 0.0
		System.out.println(obj.str); // null

		System.out.println("**********");
		Constructor4 obj1 = new Constructor4(40.30, "HelloJava");
		System.out.println(obj1.i); // 0
		System.out.println(obj1.flag); // false
		System.out.println(obj1.d); // 40.30
		System.out.println(obj1.str); // HelloJava

		System.out.println("**********");
		Constructor4 obj2 = new Constructor4(87.45, "SDET-QA");
		System.out.println(obj2.i); // 0
		System.out.println(obj2.flag); // false
		System.out.println(obj2.d); // 87.45
		System.out.println(obj2.str); // SDET-QA

		System.out.println("**********");
		Constructor4 obj3 = new Constructor4(15, true, 85.45, "Selenium");
		System.out.println(obj3.i); // 15
		System.out.println(obj3.flag); // true
		System.out.println(obj3.d); // 85.45
		System.out.println(obj3.str); // Selenium

	}

}
