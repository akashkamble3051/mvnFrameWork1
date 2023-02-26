package javaPackage2;

import javaPackage1.PublicMemberClass;

public class AccessPublicMembers {

	public static void main(String[] args) {
		PublicMemberClass obj = new PublicMemberClass();
		System.out.println(obj.a);
		obj.nonStaticMethod();

		System.out.println(PublicMemberClass.d);
		PublicMemberClass.staticMethod();
	}

}
