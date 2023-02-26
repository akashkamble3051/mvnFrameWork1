package javaTypeCasting;

public class NarrowingTypeCasting {
// narrowing type casting has to be done explicitly
	public static void main(String[] args) {
		double d = 176.85;

//		float f = d; // Compile time error as "Type mismatch: cannot convert from double to float"
		float f = (float) d;
		System.out.println(f);

		long l = (long) f;
		System.out.println(l); // Output is 176, we are losing numbers after decimal

		int i = (int) 132.78;
		System.out.println(i); // 130

//		byte data type range is -128 to 127

		byte b = (byte) i; // b =
		System.out.println(b);

		byte b1 = (byte) -130;
		System.out.println(b1);

		short s = (short) 32770;
		System.out.println(s);

		short s1 = (short) -32770;
		System.out.println(s1);
	}

}
