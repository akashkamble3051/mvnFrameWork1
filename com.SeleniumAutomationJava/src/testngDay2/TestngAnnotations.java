package testngDay2;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngAnnotations {
//	TestNg provides many annotations to write the good test code
//	Below is the TestNg annotations in the order of execution
//	1. @BeforeSuite 	--> executes before the execution of suite
//	2. @BeforeTest		--> executes before all the test cases
//	3. @BeforeClass		--> executes before the first method invokes of the current class
//	4. @BeforeMethod	--> executes before each test case method
//	5. @Test
//	6. @AfterMethod 	--> executes after each test case method
//	7. @AfterClass		--> executes after all the test method of current class executed
//	8. @AfterTest		--> executes after all the test cases
//	9. @AfterSuite		--> executes after the execution of the suite

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

	@AfterTest
	public void afterTestCase1() {
		System.out.println("After test case 1");
	}

	@AfterTest
	public void afterTestCase2() {
		System.out.println("After test case 2");
	}

	@BeforeTest
	public void beforeTestCase1() {
		System.out.println("Before test case 1");
	}

	@BeforeTest
	public void beforeTestCase2() {
		System.out.println("Before test case 2");
	}
}
