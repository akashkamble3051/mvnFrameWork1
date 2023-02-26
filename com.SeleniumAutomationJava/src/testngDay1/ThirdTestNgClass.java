package testngDay1;

import org.testng.annotations.Test;

public class ThirdTestNgClass {
	@Test(priority = 3)
	public void testCase1() {
		System.out.println("TC 1");
	}

	@Test(priority = -2)
	public void testCase2() {
		System.out.println("TC 2");
	}

	@Test(priority = 1)
	public void testCase3() {
		System.out.println("TC 3");
	}

	@Test(priority = 1)
	public void testCase4() {
		System.out.println("TC 4");
	}
}

//	by default each testng test has priority as 0
//	if two or more test cases have same priority then,
//	those test cases will be executed based on the ascending alpha numerical order of TC method's name

//	we can assign negative value to priority parameter
