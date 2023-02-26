package javaBasic;

public class MultipleClasses {
	public static void main(String[] args) {
		System.out.println("Inside the MultipleClasses");
	}
}

class Class1 {
	public static void main(String[] args) {
		System.out.println("Inside the Class1");
	}
}

class Class2 {
	public static void main(String[] args) {
		System.out.println("Inside the Class2");
	}
}
// While compilation java compiler will check the syntax only,
// if class does not contain main method, compiler will compile it.