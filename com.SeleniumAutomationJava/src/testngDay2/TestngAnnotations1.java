package testngDay2;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngAnnotations1 {

	@BeforeMethod
	public void beforeMethod1() {
		System.out.println("Before method 1");
	}

	@BeforeMethod
	public void beforeMethod2() {
		System.out.println("Before method 2");
	}

	@Test
	public void testCase1() {
		System.out.println("Test case 1");
	}

	@Test
	public void testCase2() {
		System.out.println("Test case 2");
	}

	@Test
	public void testCase3() {
		System.out.println("Test case 3");
	}

	@AfterMethod
	public void afterMethod1() {
		System.out.println("After Method 1");
	}

	@AfterMethod
	public void afterMethod2() {
		System.out.println("After Method 2");
	}
}
