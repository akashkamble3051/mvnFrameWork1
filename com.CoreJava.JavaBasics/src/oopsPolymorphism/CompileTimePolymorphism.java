package oopsPolymorphism;

public class CompileTimePolymorphism {
	public static void additionOfNumber() { // this method will add numbers 10 & 20 every time
		int a = 10, b = 20, add;
		add = a + b;
		System.out.println("Addition : " + add);
	}

	protected static void additionOfNumber(int a, int b) { // this method will ask for two number for performing
															// addition
		int add = a + b;
		System.out.println("Addition : " + add);
	}

	final void additionOfNumber(int a, int b, int c) { // this method will ask for three number for performing addition
		int add = a + b + c;
		System.out.println("Addition : " + add);
	}

	private double additionOfNumber(double d, double d1) {
		return (d + d1);
	}

	public static void main(String[] args) {
//		Compile Time Polymorphism can be achieved with the help of method overloading
//		Method overloading : creating multiple methods with same name in the same class

//		how to achieve the method overloading
//		There are 3 rules to achieve method overloading
//		1. Number of parameters of methods should be different
//		2. Type (data-type) of parameters should be different
//		3. Position of parameter should be different

		CompileTimePolymorphism obj = new CompileTimePolymorphism();

		obj.additionOfNumber(10, 20, 30);
		CompileTimePolymorphism.additionOfNumber();
		CompileTimePolymorphism.additionOfNumber(15, 20);
		System.out.println(obj.additionOfNumber(12.5, 4.2));

	}

}

// We can overload static and non-static methods
// We can change the method modifier {access & non access modifier}
// We can change the method return type
// We can overload final and private methods as well
// We can overload main method as well {as remember execution will start from main method having parameter as String[] args}