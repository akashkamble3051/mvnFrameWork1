package javaLoops;

public class WhileLoop1 {

	public static void main(String[] args) {
		char ch = 'A';
		while (ch <= 'Z') {
			if (ch % 2 != 0)
				System.out.println(ch);
			ch++;
		}
	}

}

// I want to print alternated alphabets
// A C E ....

// when only one statement is present in if, else, for-loop, while-loop then one can omit the {}
