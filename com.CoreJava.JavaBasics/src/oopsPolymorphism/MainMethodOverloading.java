package oopsPolymorphism;

public class MainMethodOverloading {

	public static void main(String[] args) {
//		as this main() has parameters as (String[] args) program execution will start from this main method

		System.out.println(MainMethodOverloading.main('s'));
		
		MainMethodOverloading obj = new MainMethodOverloading();
		obj.main();
	}

	protected void main() {
		System.out.println("This is main method overloading");
	}

	public static boolean main(char ch) {
		return true;
	}

}
