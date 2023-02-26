package javaLoops;

public class BreakStatement1 {

	public static void main(String[] args) {
		int a = 5;
//		if(a == 5) {
//			break;
//		}
		
//		break cannot be used outside of a loop or a switch
		char ch = 'a';
		while (ch <= 'z') {
			if (ch == 'p') {
				break;
			}
			ch++;
			System.out.println(ch);
		}

	}

}
// I want to print a to  z, but stop printing if character p is arrived