package javaPackage1;

// access level of protected members is within the package and outside the package through child class 
public class ProtectedMembersClass {
	protected ProtectedMembersClass() {
		System.out.println("protected class constructor");
	}

	protected int a = 45;
	protected static double d = 98.99;

	protected void nonStaticMethod() {
		System.out.println("This is protected non-static method");
	}

	protected static void staticMethod() {
		System.out.println("This is protected static method");
	}

	public static void main(String[] args) {
		ProtectedMembersClass obj = new ProtectedMembersClass();
		System.out.println(obj.a);
		obj.nonStaticMethod();

		System.out.println(ProtectedMembersClass.d);
		ProtectedMembersClass.staticMethod();
	}

}
