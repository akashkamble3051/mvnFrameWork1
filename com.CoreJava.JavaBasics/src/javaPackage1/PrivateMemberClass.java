package javaPackage1;

// private member of the class are accessible only within the same class
public class PrivateMemberClass {

	private PrivateMemberClass() {
		System.out.println("private constructor");
	}

	private int a = 45;
	private static double d = 98.99;

	private void nonStaticMethod() {
		System.out.println("This is private non-static method");
	}

	private static void staticMethod() {
		System.out.println("This is private static method");
	}

	public static void main(String[] args) {
		PrivateMemberClass obj = new PrivateMemberClass();
		System.out.println(obj.a);
		obj.nonStaticMethod();
		
		System.out.println(PrivateMemberClass.d);
		PrivateMemberClass.staticMethod();
	}

}
