package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_provider {
	
	
	@Test(dataProvider ="datasetup")
	public void test(String username,String password)
	{
		System.out.println(username+"  "+password);
	}
	
	@DataProvider
	public Object[][] datasetup()
	{
		Object [][] dataset= new Object[4][2];
		// firstrow
		dataset[0][0]="username";
		dataset[0][1]="password";
		
		// second row
		dataset[1][0]="username1";
		dataset[1][1]="password2";
	// third row
		dataset[2][0]="username2";
		dataset[2][1]="password2";
		
		// fourthrow
	
		dataset[3][0]="username3";
		dataset[3][1]="password3";
	
	return dataset;
	
	}
	
	
	

}
