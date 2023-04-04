package module1;

import org.testng.annotations.Test;

public class test02
{
	@Test(groups="regression")
	public void sub()
	{
		System.out.println("regression 2");
	}
	@Test(groups = "smoke")
	public void sub1()
	{
		System.out.println("smoke 2");
	}
}
