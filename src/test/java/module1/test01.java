package module1;

import org.testng.annotations.Test;

public class test01 
{
@Test(groups = "smoke")
public void add()
{
	System.out.println("smoke 1");
}
@Test(groups = "regression")
public void add1()
{
	System.out.println("regression 1");
}
}
