package javaPackage2;

import javaPackage1.*; // it will allow to access all the classes and interfaces of this package

public class AccessAnotherPackageClass1 {

	public static void main(String[] args) {

		PackagePractice obj = new PackagePractice();
		System.out.println(obj.a);
		System.out.println(PackagePractice.d);
		obj.nonStaticMethod();
		PackagePractice.staticMethod();

		System.out.println("********************************");
		PackagePractice1 obj1 = new PackagePractice1();
		System.out.println(obj1.a1);
		System.out.println(PackagePractice1.d1);
		obj1.nonStaticMethod1();
		PackagePractice1.staticMethod1();

	}

}
