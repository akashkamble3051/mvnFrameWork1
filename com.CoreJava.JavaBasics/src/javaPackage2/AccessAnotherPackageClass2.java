package javaPackage2;

public class AccessAnotherPackageClass2 {

	public static void main(String[] args) {
//		accessing another package class using that class fully qualified name
		javaPackage1.PackagePractice obj = new javaPackage1.PackagePractice();
		System.out.println(obj.a);
		System.out.println(javaPackage1.PackagePractice.d);
		obj.nonStaticMethod();
		javaPackage1.PackagePractice.staticMethod();
		
		
		javaPackage1.PackagePractice1 obj1 = new javaPackage1.PackagePractice1();
		System.out.println(obj1.a1);
		System.out.println(javaPackage1.PackagePractice1.d1);
		obj1.nonStaticMethod1();
		javaPackage1.PackagePractice1.staticMethod1();

	}

}
