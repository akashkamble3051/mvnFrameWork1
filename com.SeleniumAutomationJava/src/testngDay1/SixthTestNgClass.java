package testngDay1;

import org.testng.annotations.Test;

public class SixthTestNgClass {

	@Test(timeOut = 5000) // specify time in terms of milli second
	public void testCase1() throws InterruptedException {
		System.out.println("Testing login with OTP functionality");
		Thread.sleep(5500);
	}

	@Test
	public void testCase2() throws InterruptedException {
		System.out.println("Testing login without OTP functionality");
		Thread.sleep(5500);
	}
}
