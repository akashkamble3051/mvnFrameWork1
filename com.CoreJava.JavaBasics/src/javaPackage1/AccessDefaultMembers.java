package javaPackage1;

public class AccessDefaultMembers {

	public static void main(String[] args) {
		DefaultMemberClass obj = new DefaultMemberClass();
		System.out.println(obj.a);
		obj.nonStaticMethod();

		System.out.println(DefaultMemberClass.d);
		DefaultMemberClass.staticMethod();
	}

}
