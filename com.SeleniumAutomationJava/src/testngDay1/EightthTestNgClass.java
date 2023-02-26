package testngDay1;

import org.testng.annotations.Test;

public class EightthTestNgClass {

	@Test(invocationCount = 5)
	public void testCase1() {
		System.out.println("Test case 1");
	}

	@Test
	public void testCase2() {
		System.out.println("Test case 2");
	}
}

//	Using invocationCount parameter we can define number of times a test case to be executed
//	By default each test case invocationCount parameter value is 1