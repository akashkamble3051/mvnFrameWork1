package javaPackage1;

// The access level of default members are within the same package
public class DefaultMemberClass {
	DefaultMemberClass() {
		System.out.println("default class constructor");
	}

	int a = 45;
	static double d = 98.99;

	void nonStaticMethod() {
		System.out.println("This is default non-static method");
	}

	static void staticMethod() {
		System.out.println("This is default static method");
	}

	public static void main(String[] args) {
		DefaultMemberClass obj = new DefaultMemberClass();
		System.out.println(obj.a);
		obj.nonStaticMethod();

		System.out.println(DefaultMemberClass.d);
		DefaultMemberClass.staticMethod();
	}

}
