package javaPackage2;

import javaPackage1.PackagePractice; // it will allow to access only PackagePractice.java class 

public class AccessAnotherPackageClass {
	public static void main(String[] args) {
//		to access the non-static members of PackagePractice.java program stored in javaPackage1

		PackagePractice obj = new PackagePractice();
		System.out.println(obj.a);
		System.out.println(PackagePractice.d);
		obj.nonStaticMethod();
		PackagePractice.staticMethod();

//		PackagePractice1 obj1 = new PackagePractice1(); // we cannot access this class since we have not imported this class
	}
}
