package javaMethod;

public class MethodsPractice10 {

	public char showStudentGrade() {
		char ch = 'A';
		return ch; // return statement will always be the last statement of the method
//		System.out.println(ch); // after return statement in method body we cannot write anything
								// if at all we try to write then it shows compile time error as unreachable code 
	}
	
	public void getStudentDetails() {
		System.out.println("You can write your login in this method");
		return; // for void return type then return statement will not return any value
				// but return statement will be present in that method if programmer don't write it
				// then compiler will add that return statement.
	}

	public static void main(String[] args) {
		
		return;  // compiler will add that return statement
//		System.out.println("abc");
	}

}

// Compiler will convert .java file into bytecode(.class)
// while conversion it will check syntax of the code written in .java file
