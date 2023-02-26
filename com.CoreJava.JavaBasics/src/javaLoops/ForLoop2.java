package javaLoops;

// 45 --> +45
public class ForLoop2 {

	public static void main(String[] args) {
//		print a - z alphabets
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println(ch);
		}

//		print ascii values of a - z alphabets
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println((char) ch + " : " + (int) ch);
		}

	}

}
