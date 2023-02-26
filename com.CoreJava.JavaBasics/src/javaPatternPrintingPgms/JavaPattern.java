package javaPatternPrintingPgms;

public class JavaPattern {

	public void leftSidedStarPyramid(int row) {
		for (int i = 1; i <= row; i++) { // for rows
			for (int j = 1; j <= i; j++) { // for columns
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public void leftSidedNumberPyramid(int row) {
		for (int i = 1; i <= row; i++) { // for rows
			for (int j = 1; j <= i; j++) { // for columns
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	public void leftSidedAlphabetPyramid(int row) {
		char ch = 'A';
		for (int i = 1; i <= row; i++) { // for rows
			for (int j = 1; j <= i; j++) { // for columns
				System.out.print(ch + " ");
			}
			ch++;
			System.out.println();
		}
	}

	public void leftSidedInvertedStarPyramid(int row) {
		for (int i = 1; i <= row; i++) { // for rows
			for (int j = row; j >= i; j--) { // for columns
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public void fullStarPyramid(int row) {
		for (int i = 1; i <= row; i++) { // rows
			for (int j = row; j > i; j--) { // spaces before star
				System.out.print("   ");
			}
			for (int k = (2 * i) - 1; k > 0; k--) { // stars
				System.out.print(" * ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		JavaPattern obj = new JavaPattern();
//		obj.leftSidedStarPyramid(5);
//		obj.leftSidedNumberPyramid(5);
//		obj.leftSidedAlphabetPyramid(5);
//		obj.leftSidedInvertedStarPyramid(5);
		obj.fullStarPyramid(6);
	}

}
