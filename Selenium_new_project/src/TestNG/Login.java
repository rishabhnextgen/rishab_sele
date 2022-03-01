package TestNG;

import org.testng.annotations.Test;

public class Login {
	
	
	@Test(priority = 0)
	
	public void logintest()
	{
		System.out.println("this is login test");
	}

	
	@Test(priority = 1)
	public void logouttest()
	{
		System.out.println("this is logout test");
	}
}
