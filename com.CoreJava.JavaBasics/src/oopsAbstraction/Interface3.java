package oopsAbstraction;

interface Country {
	void displayCountryCapital();
}

interface State {
	void displayStateCapital();
}

class City implements Country, State {
	public void displayCountryCapital() {
		System.out.println("Capital of India is Delhi");
	}

	public void displayStateCapital() {
		System.out.println("Capital of MH is Mumbai");
	}

	public void displayCityName() {
		System.out.println("Pune");
	}
}

public class Interface3 {

	public static void main(String[] args) {
		Country cObj = new City();
		cObj.displayCountryCapital();
//		cObj.displayStateCapital();
//		cObj.displayCityName();

		State sObj = new City();
//		sObj.displayCountryCapital();
		sObj.displayStateCapital();
//		sObj.displayCityName()

		City obj = new City();
		obj.displayCountryCapital();
		obj.displayStateCapital();
		obj.displayCityName();
	}

}
