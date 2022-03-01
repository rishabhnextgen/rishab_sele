package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Meathods {
	@BeforeTest
	public void Applicationlogin()
	{
		System.out.println("login to application");
	}
	@BeforeMethod
	public void dbconnection() {
		System.out.println("connected to db");
	}
	@AfterMethod
	public void dbdisconnection() {
		System.out.println("disconnected to db");
	}
	
	@Test
	public void test1()
	{
		System.out.println("test1");
	}
	
	
	@Test
      public void test2() {
	System.out.println("test2");
}
  @AfterTest
public void logout() {
	System.out.println("logout to the application");
}


}


