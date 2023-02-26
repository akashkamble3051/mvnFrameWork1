package javaTypeCasting;

public class WideningTypeCasting {

	public static void main(String[] args) {
//		Widening type casting : convert lower data type into higher data type
//		it is safe since we will never lose data here.
//		Widening can be done explicitly as well as implicitly
		
		byte b = 125;

		int i = b; // implicit type casting or auto type casting
		int i1 = (int) b; // explicit type casting
		System.out.println(i);

		short s = b;
		System.out.println(s);

		float f = 12; // float f = (float)12;
		System.out.println(f); // 12.0

		double d = i;
		System.out.println(d);
	}

}

// converting char into int is just to get character ascii value, this is not an example of type conversion or type casting