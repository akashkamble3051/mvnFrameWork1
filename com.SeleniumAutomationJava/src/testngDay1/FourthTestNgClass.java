package testngDay1;

import org.testng.annotations.Test;

public class FourthTestNgClass {
	@Test(priority = 3, description = "Logout test cases")
	public void testCase1() {
		System.out.println("TC 1");
	}

	@Test(priority = -2, description = "Account registration test cases")
	public void testCase2() {
		System.out.println("TC 2");
	}

	@Test(priority = 1, description = "Login test cases")
	public void testCase3() {
		System.out.println("TC 3");
	}

	@Test(priority = 1, description = "Book a ticket test cases")
	public void testCase4() {
		System.out.println("TC 4");
	}
}
