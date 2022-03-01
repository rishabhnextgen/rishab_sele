 package TestNG;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class Skipped_Testcase {

	
	@Test(enabled = false)
	public void skippedtest1()
	{
		System.out.println("skippinng test1");
	}
	
	@Test
	public void skippedtest2()
	{
		System.out.println("skipping this test forcefully");
		
		throw new SkipException("forcefully");
	}
   
	boolean datasetup= false;
	@Test
	public void skippedtest3()
	{
		System.out.println("skipping three");
	
	if (datasetup==true)
	{
		System.out.println("execute");
	}
	else
	{
		throw new SkipException("skip this");
		
	}
	}


}
