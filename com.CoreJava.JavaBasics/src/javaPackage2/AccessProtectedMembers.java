package javaPackage2;

import javaPackage1.ProtectedMembersClass;

public class AccessProtectedMembers extends ProtectedMembersClass {

	public static void main(String[] args) {
//		ProtectedMembersClass obj = new ProtectedMembersClass();
//		System.out.println(obj.a);
//		obj.nonStaticMethod();

		AccessProtectedMembers obj1 = new AccessProtectedMembers();
		System.out.println(obj1.a);
		obj1.nonStaticMethod();
		
		System.out.println(ProtectedMembersClass.d);
		ProtectedMembersClass.staticMethod();
	}

}
