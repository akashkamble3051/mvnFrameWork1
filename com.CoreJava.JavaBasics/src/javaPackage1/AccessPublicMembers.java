package javaPackage1;

public class AccessPublicMembers {

	public static void main(String[] args) {
		PublicMemberClass obj = new PublicMemberClass();
		System.out.println(obj.a);
		obj.nonStaticMethod();

		System.out.println(PublicMemberClass.d);
		PublicMemberClass.staticMethod();
	}

}
