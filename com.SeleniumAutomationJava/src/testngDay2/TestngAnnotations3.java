package testngDay2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngAnnotations3 {
	@BeforeTest
	public void beforeTestCase1() {
		System.out.println("Before test case 1");
	}

	@BeforeClass
	public void beforeClass1() {
		System.out.println("Before class 1");
	}

	@BeforeMethod
	public void beforeMethod1() {
		System.out.println("Before method 1");
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

	@AfterClass
	public void afterClass1() {
		System.out.println("After class 1");
	}

	@AfterTest
	public void afterTestCase1() {
		System.out.println("After test case 1");
	}
}
