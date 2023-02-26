package javaPackage1;

// access level of public modifier is every where i.e within the class outside the class and within the package and outside the package
public class PublicMemberClass {
	public PublicMemberClass() {
		System.out.println("public class constructor");
	}

	public int a = 45;
	public static double d = 98.99;

	public void nonStaticMethod() {
		System.out.println("This is public non-static method");
	}

	public static void staticMethod() {
		System.out.println("This is public static method");
	}

	public static void main(String[] args) {
		PublicMemberClass obj = new PublicMemberClass();
		System.out.println(obj.a);
		obj.nonStaticMethod();

		System.out.println(PublicMemberClass.d);
		PublicMemberClass.staticMethod();

	}

}
