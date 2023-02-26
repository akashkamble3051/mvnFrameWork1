package testngDay1;

import org.testng.annotations.Test;

public class SecondTestNgClass {
	@Test
	public void testCase1() {
		System.out.println("TC 1");
	}

	@Test
	public void testCase2() {
		System.out.println("TC 2");
	}

	@Test
	public void testCase3() {
		System.out.println("TC 3");
	}
}

// here test cases got executed based on the ascending alpha numerical order of TC method's name