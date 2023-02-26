package oopsPolymorphism;

class Bank {
	int a = 45;

	float getRatOfInterest() {
		return 8.5f;
	}

	static void savingAccount() {
		System.out.println("Bank saving account");
	}
}

class SBI extends Bank {
	int a = 85; // data member will not be overridden

//	float getRatOfInterest() {
//		return 8.5f;
//	}

//	static void savingAccount() {
//		System.out.println("Bank saving account");
//	}

	@Override
	float getRatOfInterest() { // overrides oopsPolymorphism.Bank.getRatOfInterest
		return 9.1f;
	}

	static void savingAccount() { // the inherited method will be hidden in this case
		System.out.println("SBI Bank saving account");
	}

	void creditCardLimit() {
		System.out.println("Credit Card limi is 20000");
	}
}

public class RuntimePolymorphism {

	public static void main(String[] args) {
		Bank bObj = new Bank();
		System.out.println(bObj.getRatOfInterest());
		System.out.println(bObj.a);

		Bank obj1 = new SBI(); // auto-upcasting
		System.out.println(obj1.getRatOfInterest());
		System.out.println(obj1.a);
//		obj1.creditCardLimit()  //  since creditCardLimit() does not belongs to Bank class

		SBI obj2 = new SBI();
		System.out.println(obj2.a);
	}

}

// Mandatory:
// 1. It must have same method name
// 2. It must have same arguments or parameters
// 3. It must have same return type
// 4. The method in the child can have higher access specifier (private -> default -> protected -> public)
//		We cannot reduce the visibility of the inherited methods, but we can increase visibility or we can keep the same visibility
// 5. We cannot override the private (private property will not inherit), static & final method
// 6. The overridden method must not throw new or broader checked exception
