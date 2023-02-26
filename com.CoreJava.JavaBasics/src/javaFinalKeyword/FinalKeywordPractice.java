package javaFinalKeyword;

public class FinalKeywordPractice {
	final String bankName = "XYZ Bank";
	double rateOfInterest = 8.00;

	public static void main(String[] args) {
		final int accNumber = 12345;
		double accBalance = 4000.0;

//		accNumber = 98765; // not allowed to change the value since it is final
		accBalance = 3500.0; // allowed to change the value since it is not final

//		we cannot assign any access specifier to local variables
//		public int a = 45;
//		protected int a = 78;
//		private int a = 48;

//		we cannot make any local variable as static & non-static
//		static long l = 450; 

		FinalKeywordPractice obj = new FinalKeywordPractice();
//		obj.bankName = "ABC Bank"; // not allowed to change the value since it is final
//		obj.rateOfInterest = 9.50; // allowed to change the value since it is not final
	}

}
