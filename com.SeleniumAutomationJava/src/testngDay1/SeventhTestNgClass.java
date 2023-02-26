package testngDay1;

import org.testng.annotations.Test;

public class SeventhTestNgClass {

	@Test(priority = 0)
	public void accRegistration() {
		System.out.println("Account Registred");
	}

	@Test(priority = 1, dependsOnMethods = "accRegistration")
	public void accLogin() {
		System.out.println("Login successfull");
		int i = 5 / 0; // this will cause the test case to fail
	}

	@Test(priority = 2, dependsOnMethods = "accLogin")
	public void bookFlight() {
		System.out.println("Flight booked");
	}

	@Test(priority = 3, dependsOnMethods = "accLogin", alwaysRun = true)
	public void accLogout() {
		System.out.println("Logout successfull");
	}
}

//	if we set alwaysRun = true then that test case will execute in any situation