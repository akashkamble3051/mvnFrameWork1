package javaPackage1;

public class AccessProtectedMembers {

	public static void main(String[] args) {
		ProtectedMembersClass obj = new ProtectedMembersClass();
		System.out.println(obj.a);
		obj.nonStaticMethod();

		System.out.println(ProtectedMembersClass.d);
		ProtectedMembersClass.staticMethod();
	}

}
