package TestNG;

import org.testng.annotations.Test;

@Test(groups = "regression")
public class Group {

	@Test(groups = "regression")
	public void test1()
	{
		System.out.println("test1 executes");
	}
    @Test(groups = { "bvt", "regression"})
	public void test2()
	{
		System.out.println("test2 executes");
	}
    @Test(groups = "regression")
	public void test3()
	{
		System.out.println("test3 executes");
	}
     @Test(groups = { "bvt", "regression"})
	public void test4()
	{
		System.out.println("test4 executes");
	}

}

