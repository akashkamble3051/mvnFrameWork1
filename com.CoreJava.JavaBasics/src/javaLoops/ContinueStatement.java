package javaLoops;

public class ContinueStatement {

	public static void main(String[] args) {
		char ch = 'A';
//		do {
//			System.out.println(ch);
//			if(ch == 'N') {
//				continue;
//			}
//			ch++;
//		}while(ch <= 'Z');

//		while (ch <= 'Z') {
//			ch++;
//			if (ch == 'N') {
//				continue;
//			}
//			System.out.println(ch);
//		}

		for (; ch <= 'Z'; ch++) {
			if (ch == 'N') {
				continue;
			}
			System.out.println(ch);
		}
	}

}
// Print A to Z, but don't want N to be printed